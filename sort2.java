import java.util.*;

public class sort2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        Integer[] a = new Integer[n];


        for (int i=0;i < n;i++){
            a[i] = cs.nextInt();

        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return -Integer.compare(o1 , o2);
            }
        });
        for (int x : a){
            System.out.print(x + " ");
        }
    }
}
