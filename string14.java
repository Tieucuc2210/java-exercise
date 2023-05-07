import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class string14 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s= cs.nextLine();
        StringTokenizer p = new StringTokenizer(s);
        TreeMap<String , Integer> v= new TreeMap<>();
        while (p.hasMoreTokens()){
            String x = p.nextToken();
            if(v.containsKey(x)){
                int cnt = v.get(x);
                cnt++;
                v.put(x , cnt);
            } else v.put(x , 1);
        }
        String ans = "\0";
        int kl1=0;
        String ans2 = "\0";
        int kl2 = 9999;
        for (Map.Entry<String , Integer> x : v.entrySet()){
            if(x.getValue() >= kl1){
                kl1 = x.getValue();
                ans =x.getKey();
            }
            if(x.getValue() <= kl2){
                kl2 = x.getValue();
                ans2 = x.getKey();
            }
        }
        System.out.println(ans + " " + kl1);
        System.out.println(ans2 + " " + kl2);
    }
}
