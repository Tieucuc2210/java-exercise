import java.util.Scanner;

public class AD3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int[][] a = new int[n][m];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < m ;j++){
                a[i][j] = cs.nextInt();
            }
        }
        int sum =0;
        for (int i =0 ;i < n ;i++){
            for (int j =0 ;j < m ;j++){
                if (a[i][j] > sum){
                    sum = a[i][j];
                }
            }
        }
        for (int i=0 ;i < n ;i++){
            for (int j =0 ;j < m ;j++){
                if (sum == a[i][j]){
                    System.out.print((i +1) + " " + (j+1));
                }
            }
        }
        System.out.println("");

        int ans =99999;
        for (int i =0;i <n ;i++){
            for (int j =0 ;j < m ;j++){
                if (a[i][j] < ans){
                    ans = a[i][j];
                }
            }
        }
        for (int i=0;i <n ;i++){
            for (int j =0 ;j < m ;j++){
                if (ans == a[i][j]){
                    System.out.print((i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
