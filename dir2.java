import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class dir2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);


        int n = cs.nextInt();
        int[] a = new int[n+1];
        //HashSet<Integer> v = new HashSet<>();
        HashMap<Integer , Integer> v = new HashMap<>();
        for (int i=0 ;i < n ;i++){
            a[i] = cs.nextInt();
            if (v.containsKey(a[i])){
                int res = v.get(a[i]);
                res++;
                v.put(a[i] ,res);
            } else{
                v.put(a[i] , 1);
            }
        }
        int q = cs.nextInt();
        while (q-- >0){
            int x = cs.nextInt();
//            if (v.contains(x)) System.out.println("yes");
//            else System.out.println("no");
            if (v.containsKey(x)) System.out.println("yes");
            else System.out.println("No");
        }
    }
}
