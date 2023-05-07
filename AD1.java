import java.util.Map;
import java.util.Scanner;

public class AD1 {
    public  static  int nt(int n){
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return  0;
        }
        return  n>1 ?1 :0;
    }
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
        for (int i =0 ;i < n;i++){
            for (int j =0 ;j < m ;j++){
                if (nt(a[i][j]) == 1){
                    System.out.print(a[i][j]  + " ");
                }
            }
            System.out.println("");
        }
    }
}
