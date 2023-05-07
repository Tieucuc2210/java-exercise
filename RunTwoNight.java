import java.util.Scanner;

public class RunTwoNight {

    public static  boolean check(int n){
        int rev = 0;
        int tmp = n;
        int tong = 0;
        int cnt =0;
        while (n != 0){
            rev = rev * 10 + n % 10;
            int res= n % 10;
            if (res == 6) cnt += 1;
            tong += res;
            n /= 10;
        }
        return tmp == rev && cnt >= 1 && (tong % 10 == 8);
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        for (int i =n ; i <= m ; i++){
            if (check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
