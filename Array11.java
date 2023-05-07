import java.util.ArrayList;
import java.util.Scanner;

public class Array11 {

    static int[] f = new int[100];
    public  static  void sang(){

        f[0] = 0; f[1] =1;
        for (int i=2;i < 92 ; i++){
            f[i] = f[i-1] + f[i-2];
        }

    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        sang();
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int  i =0 ;i < n ;i++) a[i] = cs.nextInt();
        boolean ok = false;
        for (int i =0 ;i < n ;i++){
            if (f[a[i]] == 1){

                System.out.print(a[i] + " ");
                ok = true;
            }

        }
        if(!ok) System.out.println("None");
    }
}
