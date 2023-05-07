import java.util.Scanner;

public class DemChusSoN {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        long n = cs.nextLong();
        long ans =0;
        int cnt =0;
        while (n != 0){
            ans = n % 10;
            if (ans == 2 || ans == 3 || ans == 5 || ans == 7) cnt += 1;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
