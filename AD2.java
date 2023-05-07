import java.util.Scanner;

public class AD2 {
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
        for (int i =0 ;i < n ;i++){
            int sum =0;
            for (int j =0 ;j < m ;j++){
                sum += a[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println("");
        for (int i= 0 ;i < n ;i++){
            int sum =0;
            for (int j=0 ;j < m ;j++){
                sum += a[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}
