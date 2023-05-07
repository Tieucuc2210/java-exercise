import java.util.Scanner;
import java.util.Stack;

public class stack7 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        if (check2(s)) System.out.println("yes");
        else System.out.println("no");
    }
    static boolean check(char c){
        return c == '+' || c == '-' || c == '*' || c== '/';
    }
    static boolean check2(String s) {
        Stack<Character> v = new Stack<>();
        for (int i=0 ;i < s.length() ;i++){
            if (s.charAt(i) != ')'){
                v.push(s.charAt(i));
            } else {
                boolean ok = true;
                while (v.peek() != '('){
                    if (check(v.peek())) ok = false;
                    v.pop();
                }
                if (ok) return  true;
                v.pop();
            }

        }
        return  false;
    }
}
