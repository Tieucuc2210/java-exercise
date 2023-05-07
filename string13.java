import java.util.*;

public class string13 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        StringTokenizer p = new StringTokenizer(s);
        TreeMap<String, Integer> v  = new TreeMap<>();
        LinkedHashMap<String , Integer> v2 = new LinkedHashMap<>();
        while (p.hasMoreTokens()){
            String x = p.nextToken();
            if (v.containsKey(x)){
                int res = v.get(x);
                res++;
                v.put(x , res);
            } else v.put(x ,1);
            if (v2.containsKey(x)){
                int ans = v2.get(x);
                ans++;
                v2.put(x , ans);
            } else v2.put(x ,1);
        }
        for (Map.Entry<String,Integer> x : v.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println(" ");
        for (Map.Entry<String , Integer> x : v2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
