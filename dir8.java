import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class dir8 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        HashSet<Integer> v1 = new HashSet<>();
        HashSet<Integer> v2 = new HashSet<>();
        int n = cs.nextInt();
        int m = cs.nextInt();
        int[] a= new int[n];
        int[] b =new int[m];
        for (int i =0 ;i < n ; i++){
            a[i] = cs.nextInt();
            v1.add(a[i]);
        }
        for (int i =0 ;i < m ;i++){
            b[i] = cs.nextInt();
            v2.add(b[i]);
        }
        HashSet<Integer> ans = new HashSet<>();
        for (int x : v1){
            if (!v2.contains(x)){
                ans.add(x);

            }
        }
        ArrayList<Integer> p = new ArrayList<>(ans);
        for (int x : p){
            System.out.print(x + " ");
        }
    }
}
