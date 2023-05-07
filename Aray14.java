import java.util.Scanner;

public class Aray14 {
    public static  int gdc(int a , int b){
        if (b == 0) return  a;
        else return  gdc(b , a % b);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        int ans =0;
        for (int i =0 ;i < n ;i++){
            ans = gdc(ans , a[i]);
        }
        System.out.print(ans);
    }
}
