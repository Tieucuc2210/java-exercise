import java.util.*;

public class dir5 {
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
            v2.add(a[i]);
        }
        v1.addAll(v2);
        ArrayList<Integer> p = new ArrayList<>(v1);
        Comparator<Integer> cmp = Comparator.reverseOrder();
        Collections.sort(p , cmp);
        for (int x : p){
            System.out.print(x + " ");
        }
    }
}
