import java.util.*;

public class string6 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s1 = cs.nextLine();
        String s2 = cs.nextLine();
        TreeSet<Character> v1 = new TreeSet<>();
        TreeSet<Character> v2 = new TreeSet<>();
        for (char x : s1.toCharArray()){
            v1.add(x);
        }
        for (char x : s2.toCharArray()){
            v2.add(x);
        }
        TreeSet<Character> res1 = new TreeSet<>(v1);
        res1.removeAll(v2);
        TreeSet<Character> res2 = new TreeSet<>(v2);
        res2.removeAll(v1);

        ArrayList<Character> kqm = new ArrayList<>(res1);
        Collections.sort(kqm);
        ArrayList<Character> kqk = new ArrayList<>(res2);
        Collections.sort(kqk);

        StringBuilder p = new StringBuilder();
        StringBuilder p2 = new StringBuilder();
        for (char x : kqm){
            p.append(x);
        }
        for (char x : kqk){
            p2.append(x);
        }
        System.out.println(p.toString());
        System.out.println(p2.toString());

    }
}
