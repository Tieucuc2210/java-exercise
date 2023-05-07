import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i=0;i <n ;i++){
            a[i] = cs.nextInt();
        }
        int x = cs.nextInt();
        int cnt =0;
        for (int i =0 ;i < n ;i++){
            for (int j =i+ 1; j < n ;j++){
                if (a[i] + a[j] == x) cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
