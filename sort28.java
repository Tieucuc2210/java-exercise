import java.util.Arrays;
import java.util.Scanner;

public class sort28 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        int [] a = new int[n];
        for(int i=0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        boolean ok = false;
        Arrays.sort(a);
        for (int i =0 ;i < n ;i++){
            for (int j = i + 1; j < n ; j++){
                if(a[i] + a[j] == k){
                    ok = true;
                    break;
                }
            }
        }
        if(!ok) System.out.println("0");
        else System.out.println("1");
    }
}
