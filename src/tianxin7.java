import java.util.Scanner;

public class tianxin7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 1;
        for (  i =1 ; i <=10; i++ ) {
            sum +=1;
            if ( sum > 20 ) {
                break;
            }
        }
        System.out.println("i " + i +  "\t\t"+"和" + sum);
    }
}
