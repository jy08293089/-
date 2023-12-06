import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        HashMap<String, String> ID = new HashMap<>();
        try {
            FileReader fr = new FileReader("db.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] hash = line.trim().split("\\s+");
                if (hash.length == 2) {
                    ID.put(hash[0], hash[1]);
                }
            }
        }
        catch (Exception e) {
            System.out.println("파일 불러오기에 실패하였습니다.");
            return;
        }
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("id와 password를 입력해주세요.");
            System.out.println("id: ");
            String InputID = scanner.nextLine().trim();

            if(!ID.containsKey(InputID))
            {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.println("password: ");
            String InputPass = scanner.nextLine().trim();

            String storedPass = ID.get(InputID);
            if (storedPass.equals(InputPass)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            }
        }
    }
}
