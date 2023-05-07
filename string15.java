import java.util.Scanner;

public class string15 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s1 = cs.nextLine();
        String s2 = cs.nextLine();
        if(s1.contains(s2)){
            System.out.println("yes");
        } else System.out.println("no");
    }
}
