import java.util.Scanner;
import java.util.Stack;

public class stack4 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s= cs.nextLine();
        int ans = 0;
        Stack<Character> v= new Stack<>();
        for (int i =0 ;i < s.length(); i++){
            if (v.empty()){
                v.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && v.peek().equals('(')){
                ans += 2;
                v.pop();
            } else v.push(s.charAt(i));
        }
        System.out.println(s.length() - ans);
    }
}
