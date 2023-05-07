import java.util.Scanner;

public class BinhPhuongNT1 {

    public static  int check(int n){
        for (int i =2 ;i <= Math.sqrt(n) ;i++){
            if (n % i == 0){
                int cnt =0;
                while (n % i == 0){
                    cnt += 1;
                    n /= i;
                }
                if (cnt >= 2) return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        for (int i=n ;i <= m ; i++){
            if (check(i) == 1){
                System.out.print(i + " ");
            }
        }
    }
}
