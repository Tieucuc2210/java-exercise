import java.util.Scanner;

public class NTCungNhau {
    public  static int gdc(int a , int b){
        if (b == 0) return a;
        else return gdc(b , a % b);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        for (int i =n;i < m ; i++){
            for (int j= i + 1; j < m + 1; ++j){
                if (gdc(i , j) == 1){
                    System.out.println("(" + i + " , " + j + ")" );
                }
            }
        }
    }
}
