import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        for (int i =0 ;i < n;i++){
            if (i == 0){
                if (a[0] * a[1] < 0){
                    System.out.print(a[0] + " ");
                }
            } else if (i == n-1){
                if (a[n-1] * a[n-2] < 0){
                    System.out.print(a[n-1] + " ");
                }
            } else{
                if ((a[i] * a[i-1] < 0) || (a[i] * a[i+1] < 0)){
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}
