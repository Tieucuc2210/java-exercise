import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class String9 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String res = cs.nextLine();
        StringTokenizer p = new StringTokenizer(res , " ");
        HashSet<String> ans = new HashSet<>();
        while (p.hasMoreTokens()){
            ans.add(p.nextToken());
        }
        System.out.println(ans.size());





    }
}
