import java.util.Map;
import java.util.Scanner;

public class AD9 {
    public  static  int nt(int n){
        for (int i =2;i <= Math.sqrt(n) ;i++){
            if (n % i == 0) return  0;
        }
        return  n >1?1:0;
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
        int cnt = 0;
        for (int i =0 ;i < n;i++){
            if (nt(a[i][i]) == 1){
                cnt++;
            }
            if(nt(a[i][n-i-1]) == 1){
                cnt++;
            }

        }
        if (nt(a[n/2][n/2]) == 1) cnt--;
        System.out.println(cnt);
    }

}
