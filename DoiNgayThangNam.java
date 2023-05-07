import java.util.Scanner;

public class DoiNgayThangNam {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int nam = n / 365;
        n = n % 365;
        int thang = n / 7;
        n = n % 7;
        System.out.println(nam + " " + thang + " " + n);
    }
}
