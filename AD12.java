import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AD12 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        for (int i=0 ;i < n ;i++){
            for (int j =0 ;j < n ; j++){
                b[i][j] = a[j][i];
            }
        }
        for (int  i =0 ;i < n;i++){
            Arrays.sort(b[i]);
        }
        for (int i=0 ;i < n ;i++){
            for (int j=0 ;j < n ;j++){
                System.out.print(b[j][i] + " ");
            }
            System.out.println(" ");

        }
    }
}
