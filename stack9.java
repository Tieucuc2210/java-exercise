import java.util.Scanner;
import java.util.Stack;


public class stack9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = new StringBuilder(s).reverse().toString();
        Stack<String> st = new Stack<String>();
        for(char x : s.toCharArray()) {
            if(Character.isLetter(x)) {
                st.push(String.valueOf(x));
            } else {
                String tmp1 = st.pop();
                String tmp2 = st.pop();
                st.push("(" + tmp1 + x + tmp2 + ")");
            }
        }
        System.out.println(st.pop());
    }
}
