import java.util.Scanner;

public class DQ17 {
    public static void in1(int n){
        if (n < 10){
            System.out.print(n + " ");
            return ;
        }
        in1(n/10);
        System.out.print(n % 10 + " ");
    }
    public static void in2(int n){
        if (n < 10){
            System.out.println(n + " ");
            return;
        }
        System.out.print(n % 10 + " " );
        in2(n/10);
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        in1(n);
        System.out.println();
        in2(n);
    }
}
