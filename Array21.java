import java.util.*;

public class Array21 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        TreeMap<Integer , Integer> v = new TreeMap<>();
        LinkedHashMap<Integer ,Integer> v2 = new LinkedHashMap<>();
        int[] a = new int[n+1];
        for (int i =0 ;i < n ;i++){
            a[i] =cs.nextInt();
        }
        for (int i=0 ;i < n ;i++){
            if (v.containsKey(a[i])){
                int cnt = v.get(a[i]);
                cnt++;
                v.put(a[i] , cnt);
            } else{
                v.put(a[i] , 1);
            }
            if (v2.containsKey(a[i])){
                int res = v2.get(a[i]);
                res++;
                v2.put(a[i] , res);
            } else {
                v2.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> x : v2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println("");
        for (Map.Entry<Integer ,Integer> x : v.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println("");
        int gt1 =0, gt2 =0;
        int min_vl =(int)1e9 , max_vl  = 0;
        for (Map.Entry<Integer,Integer> x : v.entrySet()){
            if (x.getValue() >= max_vl){
                max_vl  = x.getValue();
                gt2 = x.getKey();
            }

        }
        for (Map.Entry<Integer,Integer> x : v.entrySet()){
            if (x.getValue() <= min_vl){
                min_vl = x.getValue();
                gt1 = x.getKey();
            }

        }

        System.out.println(gt2  +" " + max_vl);
        System.out.println(gt1 + " " + min_vl);
    }
}
