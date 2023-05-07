import java.util.Arrays;
import java.util.Scanner;

public class sort12 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n= cs.nextInt();
        int m = cs.nextInt();
        int [] a= new int[n];
        int[] b = new int[m];
        for (int i=0 ; i < n ;i++){
            a[i] = cs.nextInt();
        }
        for(int i=0 ;i < m ;i++){
            b[i] = cs.nextInt();
        }
        int cnt =0;
        int i =0 , j =0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (i < n && j < m){
            if (a[i] <= b[j]){
                i++;
            } else{
                cnt++;
                i++; j++;
            }
        }
        System.out.println(cnt);
    }
}
