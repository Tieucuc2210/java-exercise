import java.util.Scanner;

public class DQ19 {
    public  static  int check(int n){
        if (n == 0) {
            return 0;
        } else if ((n %10) % 2 == 0) return 1;
        else return check(n /10);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (check(n) == 1) System.out.println("yes");
        else System.out.println("no");
    }
}
