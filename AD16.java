import java.util.Scanner;

public class AD16 {
    static int n, m;
    static int[][] a;
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    public static void sang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            int imoi = i + dx[k];
            int jmoi = j + dy[k];
            while (imoi >= 1 && imoi <= n && jmoi >= 1 && jmoi <= m && a[imoi][jmoi] != 0) {
                sang(imoi, jmoi);
            }
        }
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        n = cs.nextInt();
        m = cs.nextInt();
        a = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = cs.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] == 1) {
                    cnt++;
                    sang(i, j);
                }
            }
        }
        System.out.println(cnt);
    }
}
