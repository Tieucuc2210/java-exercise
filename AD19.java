import java.util.Map;
import java.util.Scanner;

public class AD19 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int [][]a = new int[n+1][m+1];
        for (int i=0 ;i < n;i++){
            for(int j =0 ;j < m ;j++){
                a[i][j] = cs.nextInt();
            }
        }
        int [][] dp = new int[n+1][m+1];
        for(int i =0 ;i < n ;i++){
            for (int j=0 ;j < m ;j++){
                if (i == 0 && j == 0){
                    dp[i][j] = a[i][j];
                } else if (j == 0){
                    dp[i][j] = dp[i-1][j] + a[i][j];
                } else if  (i == 0){
                    dp[i][j] = dp[i][j-1] + a[i][j];
                } else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]) + a[i][j];
                }
            }
        }
        System.out.println(dp[n-1][m-1]);

    }
}
