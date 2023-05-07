import java.util.ArrayList;
import java.util.Scanner;

public class string29 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        s += 'a';
        String res = "";
        ArrayList<String> ok = new ArrayList<>();
        for (int i=0 ;i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                res += c;
            } else{
                while (res.length() > 0 && res.charAt(0) == '0'){
                    res = res.substring(1);
                }
                if (!res.equals("")){
                    ok.add(res);
                }
                res ="";
            }
        }
        int sum =0;
        for (int i = 0 ;i < ok.size() ; i++){
            sum += Integer.parseInt(ok.get(i));
        }
        System.out.println(sum);
    }
}
