import java.util.Scanner;

public class AD6 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        for (int i =0 ;i < n;i++){
            int tmp = a[i][i];
            a[i][i] = a[i][n-i-1];
            a[i][n-i-1] = tmp;
        }
        for (int i =0 ;i < n ; i++){
            for (int j = 0;j < n ;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
