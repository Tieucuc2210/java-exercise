import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class dir4 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int [] a = new int[n + 1];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i =0 ; i < n ;i++){
            a[i] = cs.nextInt();
            set.add(a[i]);

        }
        int q = cs.nextInt();
        while (q-- > 0){
            int tt = cs.nextInt();
            int x  = cs.nextInt();
            if (tt == 1){
                set.add(x);
            } else if(tt == 2){
                if (set.contains(x)){
                    set.remove(x);
                }
            } else {
                if (set.contains(x)){
                    System.out.println("yes");
                } else System.out.println("no");
            }
        }

    }
}
