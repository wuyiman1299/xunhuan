import java.util.Scanner;

public class tianxin5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
         sum = scanner.nextInt();

        for (int i = 1 ; i < 100 ; i++) {
            if ( i % 3 != 0) {
                sum = sum + i;

                System.out.println("不能被3整除的数为：" +i );
            }
        }
    }
}
