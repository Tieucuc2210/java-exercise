import java.util.Scanner;

public class sort35 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        int [] a= new int[n];
        for(int i=0 ;i < n;i++){
            a[i] = cs.nextInt();
        }
        int l =0 , r = n-1;
        int cnt =0;
        while (l <= r){
            if (a[l] + a[r] <= k){
                cnt++;
                l++; r--;
            } else{
                cnt++;
                r--;
            }
        }
        System.out.println(cnt);
    }
}
