
import java.util.Scanner;

class gcd_num {
    static int gcd(int m, int n){
        while(m != 0)
        {
            int x = m;
            m = n % m;
            n = x;
        }
        return n;
    }
}

class test {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("두 수를 입력하세요: ");
        int m = num.nextInt();
        int n = num.nextInt();
        num.close();

        int result = gcd_num.gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result);

    }
}