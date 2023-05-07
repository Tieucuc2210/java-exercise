import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        Stack<Integer> v = new Stack<>();
        cs.nextLine();
        while (t-- > 0){
            String s = cs.next();
            if (s.equals("show")){
                ArrayList<Integer> ans = new ArrayList<>();
                while(!v.empty()){
                    ans.add(v.peek());
                    v.pop();
                }
                Collections.reverse(ans);

                for (int x : ans){
                    System.out.print(x + " ");
                    v.push(x);
                }
                if (ans.size() == 0) System.out.println("empty");
                System.out.println(" ");
            } else if (s.equals("push")){
                int x = cs.nextInt();
                v.push(x);
            } else {
                if (!v.empty()) v.pop();
            }
        }
    }
}
