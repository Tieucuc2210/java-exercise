import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class string5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s1 = cs.nextLine();
        String s2 = cs.nextLine();
        HashSet<Character> v1 = new HashSet<>();
        HashSet<Character> v2 = new HashSet<>();

        for (char x : s1.toCharArray()){
            v1.add(x);
        }
        for (char x : s2.toCharArray()){
            v2.add(x);
        }

        HashSet<Character> giao = new HashSet<>(v1);
        giao.retainAll(v2);
        HashSet<Character> hop = new HashSet<>(v1);
        hop.addAll(v2);

        ArrayList<Character> res1 = new ArrayList<>(giao);
        Collections.sort(res1);
        ArrayList<Character> res2 = new ArrayList<>(hop);
        Collections.sort(res2);

        StringBuilder in1 = new StringBuilder();
        for (char x : giao){
            in1.append(x);
        }
        StringBuilder in2 = new StringBuilder();
        for (char x : hop){
            in2.append(x);
        }
        System.out.println(in1.toString());
        System.out.println(in2.toString());
    }
}
