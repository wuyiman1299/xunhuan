import java.util.Scanner;

public class tianxin6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0 ;
        int sum = 0 ;
        boolean flag = true ;
        for ( int i = 0; i < 5 ; i++ ) {
            System.out.println("请输入第" + (i+i) + "门课的成绩");
            score = scanner.nextInt();
            if ( score <0 ) {
                System.out.println("输入的数据有错，程序已经罢工");
                flag = false;
                break;
            }
            sum += score;

        }
    }
}
