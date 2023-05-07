import java.util.Arrays;
import java.util.Scanner;

public class sort9 {

    public static int check(int[] a , int n , int x){
        int res =-1;
        int l =0 , r = n-1;
        while (l <= r){
            int m = (l + r) /2;
            if (a[m] == x){
                res = m;
                r = m-1;
            } else if (a[m] < x){
                l = m + 1;
            } else r = m-1;
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a= new int[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        Arrays.sort(a);
        int q = cs.nextInt();
        while (q-- > 0){
            int x = cs.nextInt();
            if (check(a , n ,x) == 1){
                System.out.println("yes");
            } else{
                System.out.println("NO");
            }
        }
    }
}
