import java.util.Scanner;
import java.util.Stack;

public class stack5 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        Stack<Character> v = new Stack<>();
        for (int i =0 ;i < s.length() ; i++){
            char c = s.charAt(i);
            if (v.empty()) v.push(s.charAt(i));
            else if (s.charAt(i) == v.peek()){
                v.pop();
            } else v.push(c);
        }
        String ans = "";
        while (!v.empty()){
            ans += v.peek();
            v.pop();
        }
        if (ans.equals("")){
            System.out.println("none");
            return ;
        }
        StringBuilder z = new StringBuilder(ans);
        z.reverse();
        System.out.println(z);
    }
}
