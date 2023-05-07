import java.util.*;

public class string10 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String res = cs.nextLine();
        StringTokenizer p = new StringTokenizer(res);
        TreeSet<String> ans1 = new TreeSet<>();
        LinkedList<String> ans2 = new LinkedList<>();

        while (p.hasMoreTokens()){
            String x = p.nextToken();
            ans1.add(x);
            ans2.add(x);
        }
        for (String x : ans1){
            System.out.print(x + " ");
        }
        System.out.println(" ");
        for (String x : ans2){
            System.out.print(x + " ");
        }
    }


}
