import java.util.Scanner;

public class SoThuanNghich {

    public static  int tn(int n){
        int rev = 0; int tmp = n;
        while (n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == tmp ? 1 : 0;
    }

    public  static  int check(int n){
        int ans =0;
        for (int i =2;i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int cnt =0;
                while (n % i == 0) {
                    cnt += 1;
                    n /= i;
                }
                ans += 1;
            }

        }
        if(n != 1) ans += 1;
        return ans >= 3 ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        boolean ok = false;
        for (int i = n ;i <= m ; i++){
            if (tn(i) ==1 && check(i) == 1){
                System.out.print(i + " ");
                ok = true;
            }
        }
        if (!ok) System.out.println("-1");
    }
}
