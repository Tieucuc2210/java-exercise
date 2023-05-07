import java.util.Scanner;

public class sort10 {
    public static int dau(int a[] , int n , int x){
        int res= -1;
        int l =0 , r = n-1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] == x){
                res = m;
                r = m-1;
            } else if(a[m] < x){
                l = m +1;
            } else r= m-1;
        }
        return res;
    }
    public static int cuoi(int a[] , int n , int x){
        int res= -1;
        int l =0 , r = n-1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] == x){
                res = m;
                l = m+1;
            } else if(a[m] < x){
                l = m +1;
            } else r= m-1;
        }
        return res;
    }
    public static int s1(int [] a ,int n , int x){
        int res =-1;
        int l =0 , r= n-1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] >= x){
                res = m;
                r = m-1;
            } else l = m + 1;
        }
        return res;
    }
    public static int s2(int [] a , int n , int x){
        int res = -1;
        int l =0 , r =n-1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] > x){
                res= m;
                r = m -1;
            } else l= m +1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        int[] a= new int[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        System.out.println(dau(a , n , k));
        System.out.println(cuoi(a , n , k));
        System.out.println(s1(a , n , k));
        System.out.println(s2(a , n , k));
        int p = dau(a , n , k);
        int c = cuoi(a , n , k);
        if (p != -1){
            System.out.println(c -p +1);
        } else System.out.println("np");
    }
}
