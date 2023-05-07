import java.util.Scanner;

public class AD20 {
    static int n , m;
    static int [][]a;
    static int [] dx = {-1 , 0 , 0 ,1};
    static int [] dy = {0 , -1 , 1 , 0};
    public static void sang(int i , int j){
        a[i][j] =0;
        for (int k =0 ; k < 4; k++){
            int imoi = i + dx[k];
            int jmoi  = j + dy[k];
            while (imoi >= 1 &&imoi <= n && jmoi >= 1 && jmoi <= m && a[imoi][jmoi] != 0){
                sang(imoi ,jmoi);
            }
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        n = cs.nextInt();
        m = cs.nextInt();
        int s = cs.nextInt();
        int t = cs.nextInt();
        int u = cs.nextInt();
        int v = cs.nextInt();
        a = new int[n+1][m+1];
        for (int i=1;i <= n ; i++){
            for (int j = 1; j <= m; j++){
                a[i][j] = cs.nextInt();
            }
        }
        sang(s , t);
        if (a[u][v] == 1){
            System.out.println("NO");
        } else{
            System.out.println("yes");
        }
    }
}
