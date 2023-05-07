import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        for (int i =1; i < n ;i++){
            if (a[i] > a[i-1] && a[i] > a[i+1]){
                System.out.println(a[i]);
            }
        }
    }
}
