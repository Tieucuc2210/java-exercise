import java.util.Scanner;

public class ThuongGaiThua {
    public  static  int gt(int n){
        if (n == 1) return 1;
        else return n * gt(n-1);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        double ans = 0;

        for (int i = 0; i < n; i++) {
            ans += 1.0 / gt(i);
        }

        System.out.printf("%.4f\n", ans);

    }
}
