import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class string21 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s= cs.nextLine().toLowerCase();
        String t = cs.nextLine().toLowerCase();


        TreeSet<String> v  = new TreeSet<>();
        TreeSet<String> v1 = new TreeSet<>();
        StringTokenizer p = new StringTokenizer(s);
        StringTokenizer p2 = new StringTokenizer(t);

        while (p.hasMoreTokens()){
            String x = p.nextToken();
            v.add(x);
        }
        while (p2.hasMoreTokens()){
            String x = p2.nextToken();
            v1.add(x);
        }
        v.retainAll(v1);
        ArrayList<String> ans = new ArrayList<>(v);
        for (String x : ans){
            System.out.print(x + " ");
        }
    }
}
