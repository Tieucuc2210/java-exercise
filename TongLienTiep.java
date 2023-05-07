import java.util.Scanner;

public class TongLienTiep {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        long n = cs.nextLong();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2  * i);
        }
        System.out.printf("%.5f", sum);

    }
}
