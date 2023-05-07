import java.util.Scanner;

public class SoLocPhat {
    public  static  int check(int n){
        //int sum = 0;
        while (n != 0){
            int res = n % 10;
            if (!(res == 0 || res == 6 || res == 8)) return 0;
            n /= 10;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (check(n) == 1) System.out.println(1);
        else System.out.println(0);
    }
}
