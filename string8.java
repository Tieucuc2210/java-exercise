import java.util.HashSet;
import java.util.Scanner;

public class string8 {
    public static void main(String[] args) {
        Scanner cs=  new Scanner(System.in);
        String s= cs.nextLine();
        HashSet<Character> p = new HashSet<>();
        for (char x : s.toCharArray()){
            p.add(x);
        }
        if (p.size() == 26) System.out.println("yes");
        else System.out.println("No");
    }
}
