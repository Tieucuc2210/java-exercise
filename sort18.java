import java.util.Scanner;

public class sort18 {
    public static  int check(int[] a , int l , int r , int k){
        int res = -1;
        while (l <= r){
            int m = (l + r)/2;
            if(a[m] < k){
                res = m;
                l = m +1;
            } else r = m-1;
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k =cs.nextInt();
        int [] a = new int[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        int ans =0;
        for (int i=0 ;i < n ;i++){
            int p = check(a , i + 1, n -1 , k - a[i]);
            if(p != -1){
                ans += p - i;
            }
        }
        System.out.println(ans);
    }
}
