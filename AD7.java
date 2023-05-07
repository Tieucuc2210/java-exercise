import java.util.Scanner;

public class AD7 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        int x = cs.nextInt();
        int y = cs.nextInt();
        for (int i=0 ;i < n;i++){
            int tmp = a[x-1][i];
            a[x-1][i] = a[y-1][i];
            a[y-1][i] = tmp;
        }
        for (int i =0 ;i < n ;i++){
            for (int j =0 ;j < n ;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
