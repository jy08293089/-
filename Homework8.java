import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Homework8 {
    public static void main(String[] args) {
        HashMap<String, String> ID = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        ID.put("myId", "myPass");
        ID.put("myId2", "myPass2");
        ID.put("myId3", "myPass3");

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
