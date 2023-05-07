import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort24 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        Integer [] a= new Integer[n];
        for(int i=0 ;i < n;i++){
            a[i] = cs.nextInt();
        }
        int ans = a[0];

        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1 , o2);
            }
        });

        int sum =0;
        for (int i =1;i < n ;i++){
            if(i <= k) ans += a[i];
            else ans -= a[i];
        }
        System.out.println(ans);
    }
}
