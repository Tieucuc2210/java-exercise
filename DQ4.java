import java.util.Scanner;

public class DQ4 {
    public  static int check(int n){
        if (n == 1) return -1;
        else if(n % 2 == 0) return n + check(n-1);
        else return check(n-1) - n;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(check(n));
    }
}
