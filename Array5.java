import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i=0;i <n ;i++){
            a[i] = cs.nextInt();
        }
        boolean ok = false;
        for (int i =0 ;i < n ;i++){
            if (a[i] % 2 == 0 && i % 2 == 0){
                ok = true;
                System.out.print(a[i] + " ");
            }
        }
        if (!ok) System.out.println("NO");

    }
}
