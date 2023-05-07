import java.util.Scanner;

public class DQ10 {

    public static double res(double n){
        if (n == 1) return  1;
        else return  1.0 / n + res(n-1);
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        double n = cs.nextDouble();
        double ans = res(n);
        System.out.printf("%.3f", ans);
    }
}
