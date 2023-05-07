import java.util.Scanner;

public class AD5 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }

        System.out.println("p1");
        for (int i=0 ;i < n ;i++){
            for (int j =0 ;j < n ;j++){
                System.out.print(a[j][i] + " " );
            }
            System.out.println(" ");
        }
        System.out.println("p2");
        for (int i = n-1; i >= 0 ; i--){
            for (int j= n-1 ;j >= 0; j--){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("p3");
        for (int i= n-1 ;i >= 0 ;i--){
            for (int j = 0; j < n ; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("p4");
        for (int i=0 ;i < n ;i++){
            for (int j = n-1;j >= 0 ;j--){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
