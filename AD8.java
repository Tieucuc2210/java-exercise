import java.util.Scanner;

public class AD8 {
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
            int tmp = a[i][x-1];
            a[i][x-1] = a[i][y-1];
            a[i][y-1] = tmp;
        }
        for (int i =0 ;i < n ;i++){
            for (int j =0 ;j < n ;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
