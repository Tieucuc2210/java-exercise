import java.util.Scanner;

public class fibo2 {

    public  static  int check(int n){
        int f1 = 0 , f2 = 1;
        if (n == 0 || n == 1) return 1;
        int f3 =0;
        for (int i =2 ;i < 92; i++){
            f3 = f2 + f1;
            if (f3 == n) return 1;
            f1 = f2;
            f2 = f3;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (check(n) ==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
