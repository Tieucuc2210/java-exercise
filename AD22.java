import java.util.Scanner;

public class AD22 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        for (int i =0 ;i < n ;i++){
            if (i % 2 == 0){
                for (int j =0 ;j < n ;j++){
                    System.out.print(a[i][j] + " ");
                }
                //System.out.print(" ");
            } else {
                for(int j = n-1 ;j >=0 ;j--){
                    System.out.print(a[i][j] + " ");
                }
               // System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
