import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        int min_vl =0;
        for (int i=0 ;i < n ;i++){
            min_vl = Math.min(a[i] , min_vl);
        }
        int cnt =0;
        for (int i = 0; i < n ;i++){
            if (min_vl == a[i]){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
