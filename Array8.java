import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[1000000];
        for (int i=0;i <n ;i++){
            a[i] = cs.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 0 ;i < n ; i++){
            if (cnt[a[i]] != 0){
                System.out.print(a[i] + " ");
            }
            cnt[a[i]] = 0;
        }
    }
}
