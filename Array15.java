import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
        }
        int s1 = 0 , s2 =0;
        for (int i =0 ;i < n ;i++){
            if (a[i] > s1){
                s2 = s1;
                s1 = a[i];
            } else if (a[i] > s2){
                s2 = a[i];
            }
        }
        System.out.println(s1 + " " + s2);
    }
}
