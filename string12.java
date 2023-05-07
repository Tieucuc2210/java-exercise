import java.util.*;

public class string12 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        LinkedHashSet<String> ans = new LinkedHashSet<>();
        StringTokenizer w = new StringTokenizer(s);
        while (w.hasMoreTokens()){
            String x = w.nextToken();
            if(check(x)){
                ans.add(x);
            }
        }
        ArrayList<String> init = new ArrayList<>(ans);
        Collections.sort(init, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        for (String x : init){
            System.out.print(x  + " ");
        }
    }
    public static boolean check(String s){
        String t = s;
        StringBuilder p = new StringBuilder(t);
        p.reverse();
        String res = p.toString();
        if(s.equals(res)){
            return true;
        } else return false;
    }
}
