import java.util.Scanner;

public class AD23 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        for(int i =0 ;i < n ;i++){
            for (int j=0 ;j < n ;j++){
                if (i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print(a[i][j] + " ");
                } else{
                    System.out.print(" ");
                }
                //System.out.println(" ");
            }
            //System.out.println(" ");
        }
    }
}
