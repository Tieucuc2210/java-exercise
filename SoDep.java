import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ; i < n ;i++){
            a[i] = cs.nextInt();
        }
        boolean ok = false;
        for (int i =0 ;i < n ;i++){
            if (a[i] == 2022){
                ok = true;
                break;
            }
        }
        if (ok) {
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
