import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class dir6 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        LinkedHashSet<Integer> v1= new LinkedHashSet<>();
        LinkedHashSet<Integer> v2 = new LinkedHashSet<>();
        int n = cs.nextInt();
        int m = cs.nextInt();
        int []a =new  int[n];
        int []b = new  int[m];
        for (int i=0 ;i < n ;i++){
            a[i] = cs.nextInt();
            v1.add(a[i]);
        }
        for (int i =0; i < m ;i++){
            b[i] = cs.nextInt();
            v2.add(b[i]);
        }
        v1.retainAll(v2);
        ArrayList<Integer> p = new ArrayList<>(v1);
        for (int x : p){
            System.out.print(x + " ");
        }
    }
}
