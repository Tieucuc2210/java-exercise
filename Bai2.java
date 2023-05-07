import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int n = cs.nextInt();
        long m = cs.nextLong();
        cs.nextLine();
        char a = cs.nextLine().charAt(0);
        float c = cs.nextFloat();
        double d = cs.nextDouble();

        System.out.println(n);
        System.out.println(m);
        System.out.println(a);
        DecimalFormat s = new DecimalFormat("#.##");
        String res = s.format(c);
        DecimalFormat p = new DecimalFormat("0.000000000");
        String ans = p.format(d);
        System.out.println(res);
        System.out.println(ans);
    }
}
