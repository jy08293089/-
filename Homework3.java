import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇 개의 수를 입력할 예정인가요?: ");
        int num = scanner.nextInt();

        int[] Number = new int[num];

        System.out.println("수를 입력하세요: ");

        for(int i=0; i<num; i++) {
            Number[i] = scanner.nextInt();
        }

        scanner.close();

        if (num > 0){
            int maxNum = Number[0];
            int minNum = Number[0];

            for(int i=1;i<num;i++){
                if (Number[i] < minNum) {
                    minNum = Number[i];
                }

                if (Number[i] > maxNum) {
                    maxNum = Number[i];
                }
            }
            System.out.printf("최댓값: %d \n", maxNum);
            System.out.printf("최솟값: %d \n", minNum);
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }


    }
}
