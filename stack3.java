import java.util.Scanner;
import java.util.Stack;

public class stack3 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s =cs.nextLine();
        if (check(s)) System.out.println("yes");
        else System.out.println("no");
    }
    static boolean check(String s){
        Stack<Character> v= new Stack<>();
        for (int i =0 ;i < s.length() ; i++){
            char c = s.charAt(i);
            if(c == ']'){
                if (v.peek().equals('[')){
                    v.pop();
                } else return false;

            } else if (c == ')'){
                if (v.peek().equals('(')){
                    v.pop();
                } else  return  false;
            } else if (c == '}'){
                if (v.peek().equals('}')){
                    v.pop();
                } else return  false;
            } else v.push(c);
        }
        return v.size() == 0;
    }
}
