import java.util.Scanner;

public class Aray12 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        int n = cs.nextInt();
        int[] a = new int[n];
        for (int  i =0 ;i < n ;i++) a[i] = cs.nextInt();
        int min_vl = 99999; int max_vl =0;
        int id1=0 ,id2 = 0;
        for (int i =0 ;i < n ;i++){
            if (a[i] > max_vl){
                max_vl = a[i];
                id1 =i;
            }
            if (a[i] <= min_vl){
                min_vl = a[i];
                id2 = i;
            }
        }
        System.out.println(id1 + " " + id2);
    }
}
