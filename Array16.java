import java.util.Map;
import java.util.Scanner;

public class Array16 {
    public static  int nt(int n){
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return  0;
        }
        return  n>1 ?1 : 0;
    }
    public static  int tn(int n){
        int rev =0 , tmp = n;
        while ( n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return  tmp == rev ? 1  : 0;
    }
    public static  int scp(int n){
        int z = (int) Math.sqrt(n);
        if (z * z == n) return 1;
        else  return  0;
    }
    public static  int tong(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return nt(sum);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        int cnt1=0 , cnt2= 0 , cnt3 =0 ,cnt4  =0;
        for (int i =0 ;i < n ;i++){
            if(nt(a[i]) == 1) cnt1++;
            if(tn(a[i]) ==1 ) cnt2++;
            if(scp(a[i]) == 1) cnt3++;
            if (tong(a[i]) == 1) cnt4++;
        }
        System.out.println(cnt1 +"\n" + cnt2 +"\n"+ cnt3 +"\n"+ cnt4);
    }
}
