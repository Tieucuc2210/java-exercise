import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i=0;i <n ;i++){
            a[i] = cs.nextInt();
        }
        int x = cs.nextInt();
        int cnt1= 0, cnt2 = 0;
        for (int i =0 ;i < n ;i++){
            if(a[i] >= x){
                cnt1 += 1;
            } else{
                cnt2 += 1;
            }
        }
        System.out.println(cnt1 + " " + cnt2);
    }
}
