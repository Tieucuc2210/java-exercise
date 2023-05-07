import java.util.*;

public class DD2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        LinkedHashMap<Integer ,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = cs.nextInt();
            if (map.containsKey(a[i])){
                int cnt = map.get(a[i]);
                cnt++;
                map.put(a[i] , cnt);
            } else{
                map.put(a[i] , 1);
            }
        }
        int res1 =0 , max_vl = 0;
        for (Map.Entry<Integer ,Integer> x : map.entrySet()){
            if (x.getValue() > max_vl){
                max_vl = x.getValue();
                res1 = x.getKey();
            }
        }
        System.out.println(res1 + " " + max_vl);
    }
}
