import java.util.Scanner;

public class AD13 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int s = cs.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][s];
        int [][] c = new int[n][s];
        for (int i =0 ;i < n;i++){
            for (int j=0 ;j < m ; j++){
                a[i][j] = cs.nextInt();
            }
        }
        for (int i = 0 ;i < m ;i++){
            for (int j =0 ;j < s; j++){
                b[i][j] = cs.nextInt();
            }
        }
        for (int i =0 ;i < n ;i++){
            for (int j =0 ;j < s ; j++){
                for (int k =0 ;k < m ; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i=0 ;i < n ;i++){
            for (int j =0 ;j < s ; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
