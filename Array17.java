import java.util.Scanner;

public class Array17 {
    public static boolean check(int[] a, int l , int r){
        if (l >= r) return true;
        else{
            if (a[l] != a[r]) return  false;
            return  check(a , l + 1, r-1);
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        if(check(a , 0 , n -1)) System.out.println("yes");
        else System.out.println("no");
    }
}
