import java.util.Scanner;

public class TongChuSo {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        long n = cs.nextLong();
        int sum =0;
        while (n >= 10){
            int ans =0;
            while (n != 0){
                ans += n % 10;
                n /= 10;
            }
            n = ans;
        }
        System.out.println(n);
    }
}
