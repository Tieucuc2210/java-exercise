import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
        }
        int[] pre = new int[1000];
        pre[0] = 0;
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + a[i];
            System.out.print(pre[i] + " ");
        }

    }
}
