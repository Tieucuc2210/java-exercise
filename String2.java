import java.util.Locale;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s1 = cs.nextLine();
        String s2= cs.nextLine();

        System.out.println(s1.toUpperCase() + " " + s2.toUpperCase());
        System.out.println(s1.toLowerCase() + " " + s2.toLowerCase());
    }
}
