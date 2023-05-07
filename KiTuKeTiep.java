
import java.util.Scanner;
public class KiTuKeTiep {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        /*char c = cs.nextLine().charAt(0);
        if (c == 'z' || c== 'Z'){
            System.out.println('a');
        } else{
            int tmp = (int) c;
            tmp += 1;
            System.out.println(Character.toLowerCase((char) tmp));
        }*/
        String s = cs.next();
        if (Character.isLowerCase(s.charAt(0))){
            System.out.println(s.toUpperCase());
        } else if (Character.isUpperCase(s.charAt(0))){
            System.out.println(s.toLowerCase());
        } else{
            System.out.println(s);
        }
    }
}
