import java.util.Map;
import java.util.Scanner;

public class Array10 {
    public  static  int nt(int n){
        for (int i = 2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return  0;
        }
        return  n >1 ?1 :0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int  i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        for (int i =0 ;i < n ;i++){
            int l =0;
            for (int j =0 ;j < i ; j++){
                l += a[j];
            }
            System.out.println("so1 : " +l + " ");
            int r = 0;
            for (int j=i +1;j < n ;j++){
                 r += a[j];
            }
            System.out.println("so 2 : "+r + " ");
            if (nt(l) == 1 && nt(r) == 1){
                System.out.println(i + " ");
            }
        }
    }

}
