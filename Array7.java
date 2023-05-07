import java.math.BigInteger;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i=0;i <n ;i++){
            a[i] = cs.nextInt();
        }
        int min_vl = 999999;
        for (int i =0 ;i < n ;i++){
            for (int j = i + 1; j < n ;j++){
                min_vl = Math.min(min_vl , Math.abs(a[i] - a[j]));
            }
        }
        System.out.println(min_vl);

    }
}
