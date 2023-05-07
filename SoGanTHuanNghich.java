import java.util.Scanner;

public class SoGanTHuanNghich {
    public  static  int tn(int n){
        int rev =0 , tmp =0;
        while (n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return  rev == tmp ? 1 : 0;
    }
    public static boolean cd(int n) {
        int res = n % 10;
        n /= 10;
        int m = 0;
        while (n >= 10) {
            m = m * 10 + n % 10;
            n /= 10;
        }
        if ((res * 2 == n || n * 2 == res) && tn(m) ==1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if(cd(n)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
