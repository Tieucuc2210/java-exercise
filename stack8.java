import java.util.Scanner;
import java.util.Stack;

public class stack8 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s = cs.nextLine();
        Stack<Character> v = new Stack<>();
        int ans =0;
        for (int i=0; i < s.length() ; i++){
            char c = s.charAt(i);
            if (c == '('){
                v.push(c);
            } else {
                if(v.empty()){
                    ans++;
                    v.push('(');
                } else v.pop();
            }
        }
        System.out.println(v.size());
        System.out.println(v.size() / 2 + ans);
    }
}
