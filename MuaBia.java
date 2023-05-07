import java.util.Scanner;

public class MuaBia {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int ans = n / 28;
        int vo = ans;
        while (vo >= 3){
            int tmp = vo / 3;
            ans += tmp;
            vo = vo % 3 + tmp;
        }
        System.out.println(ans);
    }
}
