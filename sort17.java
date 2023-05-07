import java.util.Scanner;

public class sort17 {
    public static int dau(int a[] , int l , int r , int k){
        int res = -1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] == k){
                res = m;
                r = m-1;
            } else if(a[m] < k){
                l = m +1;
            } else{
                r = m-1;
            }
        }
        return res;
    }
    public static int cuoi(int a[] , int l , int r , int k){
        int res = -1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] == k){
                res = m;
                l= m+1;
            } else if(a[m] < k){
                l = m +1;
            } else{
                r = m-1;
            }
        }
        return res;
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
        for(int i =0;i < n ;i++){
            int p = dau(a , i+1 , n-1 , k - a[i]);
            if (p != -1){
                int z =cuoi(a , i+1, n-1 , k  - a[i]);
                ans += z -p + 1;
            }
        }
        System.out.println(ans);
    }
}
