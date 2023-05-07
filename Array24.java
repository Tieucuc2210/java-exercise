import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
        }
        int sum =0;
        for (int i=0 ;i < k ;i++){
            sum += a[i];
        }
        System.out.println(sum);
        int ans =sum;
        for (int i =k ;i < n ;i++){
            sum = sum - a[i-k] + a[i];
            System.out.println(sum + " ");
        }
    }
}
