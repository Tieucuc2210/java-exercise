import java.util.*;

public class dir3 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);


        int n = cs.nextInt();
        int[] a = new int[n+1];
        //LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashMap<Integer , Integer> v= new LinkedHashMap<>();
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
        for (Map.Entry<Integer , Integer> x : v.entrySet()){
            System.out.print(x.getKey() + " ");
        }
    }

}
