import java.util.Scanner;
import java.util.Stack;

public class stack6 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s = cs.next();
        //cs.nextLine();
        int k = cs.nextInt();
        Stack<Character> v= new Stack<>();
        for (int i=0 ;i < s.length() ; i++){
            if(v.empty()) v.push(s.charAt(i));
            else if(s.charAt(i) != v.peek() || v.size() + 1 < k){
                v.push(s.charAt(i));
            } else{
                int ans =0;
                for (int j =0 ;j < k - 1; j++){
                    if (s.charAt(i) == v.peek()){
                        v.pop();
                        ans++;
                    } else break;
                }
                if (ans < k - 1){
                    for (int j =0 ;j < ans + 1; j++){
                        v.push(s.charAt(i));
                    }
                }
                String res = "";
                while (!v.empty()){
                    res += v.peek();
                    v.pop();
                }
                StringBuilder p = new StringBuilder(res);
                if (res.equals("")){
                    System.out.println("none");
                    return;
                } else{
                    p.reverse();
                    System.out.println(p);
                }

            }
        }
    }
}
