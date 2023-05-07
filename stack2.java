import java.util.Scanner;
import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        cs.nextLine();
        Stack<Integer> v= new Stack<>();
        while (t-- > 0){
            String s= cs.next();
            if (s.equals("push")){
                int x = cs.nextInt();
                v.push(x);
            } else if(s.equals("top")){
                System.out.println(v.peek());
                v.pop();
            } else{
                if(v.empty()) System.out.println("none");
            }
        }
    }
}
