import java.util.Scanner;

public class tianxin4 {
    public static void main(String[] args) {
        System.out.println("请输入一个值：");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();

        for ( int i = 0 , j = val ; i <= 6 ; i ++ , j-- ){
            System.out.println(i +  " + " + j + " = " + ( i + j ));

        }
    }
}
