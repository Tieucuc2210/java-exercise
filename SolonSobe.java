import java.text.DecimalFormat;
import java.util.Scanner;

public class SolonSobe {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        System.out.println(n /m *m);
        if (n % m == 0){
            System.out.println(n);
        } else{
            System.out.println((n /m) * m + m);
        }

    }
}
