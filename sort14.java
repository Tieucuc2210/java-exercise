import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort14 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        Integer [] a = new Integer[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1 , o2);
            }
        });
        int ans =0;
        for (int i = 0;i < n;i++){
            if (a[i] - i >= 0){
                ans += a[i] -i;
            } else break;
        }
        System.out.println(ans);
    }
}
