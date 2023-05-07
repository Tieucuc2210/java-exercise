import java.util.Scanner;

public class SoThuanNT {

    public  static  int check(int n){
        if (n < 2) return 0;
        for (int i =2 ;i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return 0;
        }
        return 1;
    }
    public   static int ans(int n){
        int tong = 0;
        while (n != 0){
            int vp = n % 10;
            tong += vp;
            if (!(vp == 2 || vp == 3 || vp == 5 || vp == 7)) return 0;
            n /= 10;
        }
        return check(tong);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int cnt =0;
        for (int i =n ; i <= m ; i++){
            if (check(i)==1 && ans(i) ==1){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
