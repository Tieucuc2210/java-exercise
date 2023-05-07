import java.util.Scanner;

public class DQ23 {
    public static  int check(int[] a,  int n){
       if (n >= 1){
           if (a[n-1] % 2 != 0){
               return 0;
           } else check(a , n-1);
       }
       return 1;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        if (check(a , n) ==1) System.out.println("yes");
        else System.out.println("no");
    }
}
