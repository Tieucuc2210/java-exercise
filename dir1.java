import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class dir1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        //HashSet<Integer> set = new HashSet<>();
        int n = cs.nextInt();
        int[] a = new int[n+1];
        //HashSet<Integer> set = new HashSet<>();
        HashMap<Integer ,Integer> v = new HashMap<>();
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
            if (v.containsKey(a[i])){
                int res = v.get(a[i]);
                res++;
                v.put(a[i] , res);
            } else{
                v.put(a[i] , 1);
            }

        }
        //System.out.println(set.size());
        System.out.println(v.size());

    }
}
