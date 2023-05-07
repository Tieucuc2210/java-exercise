import java.util.Scanner;

public class DQ15
{
    public  static  int check(int n){
        if (n < 10) {
            return n;
        } else{
            return check(n /10);
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(check(n));

    }
}
