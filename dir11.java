import java.util.*;

public class dir11 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n =cs.nextInt();
        int [] a = new int[n];
        TreeMap<Integer , Integer> p = new TreeMap();
        LinkedHashMap<Integer , Integer> p2 = new LinkedHashMap<>();
        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
            if (p.containsKey(a[i])){
                int res = p.get(a[i]); res++;
                p.put(a[i] , res);
            } else{
                p.put(a[i] , 1);
            }
            if (p2.containsKey(a[i])){
                int ans = p2.get(a[i]);
                ans++;
                p2.put(a[i] , ans);
            } else{
                p2.put(a[i] , 1);
            }
        }
        for (Map.Entry<Integer , Integer> x : p.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println();
        for (Map.Entry<Integer , Integer> x : p2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }

    }
}
