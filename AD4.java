import java.util.Scanner;

public class AD4 {
    public static  int check(int n){
        int rev =0 ,tmp = n;
        while (n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return  rev == tmp ?1 : 0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        int cnt =0;
        for (int i =0 ;i < n ;i++){
            for (int j=0 ;j <= i ; j++){
                if (check(a[i][j]) == 1){
                   cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
