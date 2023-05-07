import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a= new int[n];
        for (int i = 0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        int c =0 , l = 0 , sum1 =0 , sum2 =0;
        for (int i=0;i < n ;i++){
            if(a[i] % 2 == 0){
                c++;
                sum1 += a[i];
            } else{
                l++;
                sum2 += a[i];
            }
        }
        System.out.println(l + " " + c + " " + sum1 + " " + sum2);
    }
}
