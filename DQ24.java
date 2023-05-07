import java.util.Scanner;

public class DQ24 {
    public static  boolean check(int[] a,  int n){
        if (n == 1){
            return true;
        } else {

            if (a[n-1] <= a[n-2]) return  false;
            else return  check(a , n -1);
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        if (check(a , n)) System.out.println("yes");
        else System.out.println("no");
    }
}
