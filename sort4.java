import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class sort4 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        Integer [] a= new Integer[n];
        for (int i = 0;i < n ;i++){
            a[i] = cs.nextInt();
        }
        int minvl = 99999;
        Arrays.sort(a);
        for (int i =1 ; i < n ;i++){
            minvl = Math.min(minvl , a[i] - a[i-1]);
        }
        System.out.println(minvl);

    }
}
