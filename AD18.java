import java.util.Scanner;

public class AD18 {
    static int n, m;
    static int[][] a;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static boolean isMax(int i, int j) {
        for (int k = 0; k < 4; k++) {
            int imoi = i + dx[k];
            int jmoi = j + dy[k];
            if (imoi >= 0 && imoi < n && jmoi >= 0 && jmoi < m) {
                if (a[imoi][jmoi] >= a[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isMax(i, j)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
