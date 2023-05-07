import java.util.Arrays;
import java.util.Scanner;

public class sort20 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a= new int[n];
        for (int i=0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        int cnt =0;
        Arrays.sort(a);
        for(int i =1 ;i < n ;i++){
            if (a[i] != a[i-1]) cnt += 1;
        }
        System.out.println(a[n-1] - a[0] - cnt);
    }
}
