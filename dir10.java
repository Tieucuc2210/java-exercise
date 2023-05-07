import java.util.HashSet;
import java.util.Scanner;

public class dir10 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int [] a= new int[n + 1];
        HashSet<Integer> ans = new HashSet<>();
        for (int i=0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        int[] f =new  int[n+1];
        for (int i = n-1 ; i >= 0; i--){
            ans.add(a[i]);
            f[i] = ans.size();
        }
        int q= cs.nextInt();
        while (q-- > 0){
            int x = cs.nextInt();
            System.out.println(f[x]);
        }
    }
}
