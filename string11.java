import java.util.*;

public class string11 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        StringTokenizer p = new StringTokenizer(s);
        TreeSet<String> res1 = new TreeSet<>();
        ArrayList<String> res2 = new ArrayList<>();
        while (p.hasMoreTokens()){
            String x = p.nextToken();
            res1.add(x);
            res2.add(x);
        }
        ArrayList<String> ans = new ArrayList<>(res1);
        ArrayList<String> ans2 = new ArrayList<>(res2);

        for (String x : ans){
            System.out.print(x + " ");
        }
        Collections.sort(ans2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2);
                } else return o1.length() - o2.length();
            }
        });
        System.out.println(" ");
        for (String x : ans2){
            System.out.print(x + " ");
        }
    }

}
