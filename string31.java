import java.util.Scanner;

public class string31 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        int sum =0;
        for (int i=0 ;i < s.length() ;i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println(sum);
    }
}
