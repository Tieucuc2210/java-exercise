import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Fibo1 {
    public static void check(int n){
        if (n == 1) System.out.println(1);
        else if (n ==2) System.out.println(1 + "\n" + 1);
        else {
            int f1 =1 , f2 =1 , f3 =0;
            System.out.println(1 + "\n" + 1);

            for (int i=2;i < n ;i++){
                f3 = f1 + f2;
                System.out.println(f3);
                f1 = f2;
                f2 = f3;
            }
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        check(n);
    }
}
