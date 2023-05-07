import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class string28 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String  s = cs.nextLine();
        String res = "";
        StringBuilder z = new StringBuilder(s);
        ArrayList<String> v = new ArrayList<>();

        for (int i =0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                res += c;
            } else{
                while (res.length() > 0 && res.charAt(0) == '0'){
                    res = res.substring(1);
                }
                if (!res.equals("")){
                    v.add(res);
                }
                res ="";
            }
        }
        Collections.sort(v);
        System.out.println(v.get(v.size() -1));
    }
}
