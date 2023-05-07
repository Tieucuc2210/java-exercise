import java.util.Scanner;

public class SCP1 {

    public  static  int check(int n){
        int z = (int)Math.sqrt(n);
        if (z * z == n) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (check(n) == 1) System.out.println("yes");
        else System.out.println("no");
    }
}
