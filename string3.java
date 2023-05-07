import java.util.*;

public class string3 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s = cs.nextLine();
        TreeMap<Character , Integer> v= new TreeMap<>();
        LinkedHashMap<Character , Integer> v2 = new LinkedHashMap<>();
        for (char x : s.toCharArray()){
            if (v.containsKey(x)){
                int cnt = v.get(x);
                cnt++;
                v.put(x , cnt);
            } else{
                v.put(x , 1);
            }
            if(v2.containsKey(x)){
                int res =v2.get(x);
                res++;
                v2.put(x , res);
            } else v2.put(x ,1);
        }
        for (Map.Entry<Character ,Integer> x : v.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println(" ");
        for (Map.Entry<Character , Integer> x : v2.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
