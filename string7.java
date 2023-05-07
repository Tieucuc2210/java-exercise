import java.util.Scanner;

public class string7 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        StringBuilder v = new StringBuilder(s);
        v.reverse();
        String res = v.toString();
        if (s.equals(res)){
            System.out.println("ýes");

        } else{
            System.out.println("No");
        }

    }
}
