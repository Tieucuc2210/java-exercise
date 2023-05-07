import java.util.Scanner;

public class DQ22 {
    public static void in1(int[] a , int n){
        if (n >= 1){
            System.out.print(a[n-1] + " ");
            in1(a , n-1);
        }
    }
    public static void in2(int[] a, int n){
        if (n >= 1){
            in2(a , n-1);
            System.out.print(a[n-1] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        in1(a , n);
        System.out.println();
        in2(a , n);
    }
}
