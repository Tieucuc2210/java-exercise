import java.util.Arrays;
import java.util.Scanner;

public class sort11 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int[] a= new int[n];
        int[] b = new int[m];
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        for (int i =0  ;i < m;i++){
            b[i] = cs.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int i =0 , j =0;
        while (i < n && j < m){
            if (a[i] <= b[j]){
                System.out.print("b" + (i+1) + " ");
                i++;
            } else{
                System.out.print("c" + (j +1) + " ");
                j++;
            }
        }
        while (i < n){
            System.out.print("b" + (i +1) + " ");
            i++;
        }
        while (j < m){
            System.out.print("c" + (j + 1) +  " ");
            j++;
        }
    }
}
