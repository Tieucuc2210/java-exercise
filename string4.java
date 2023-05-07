import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class string4 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        HashMap<Character , Integer> v= new HashMap<>();
        for (char x : s.toCharArray()){
            if (v.containsKey(x)){
                int res = v.get(x);
                res++;
                v.put(x , res);
            } else v.put(x , 1);
        }
        char ans1 = '\0', ans2 = '\0';
        int kl1 =0 , kl2 = 99999;
        for (Map.Entry<Character , Integer> x : v.entrySet()){
            if(x.getValue() >= kl1){
                kl1 = x.getValue();
                ans1 = x.getKey();
            }
            if (x.getValue() <= kl2){
                kl2 = x.getValue();
                ans2 = x.getKey();
            }
        }
        System.out.println(ans1 + " " + kl1);
        System.out.println(ans2 + " " + kl2);
    }


}
