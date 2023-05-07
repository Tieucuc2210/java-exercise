import java.util.Scanner;

public class string27 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s= cs.nextLine();
        //s += "#";
        int cnt =1 , dem = 1;
        String ans = "" + s.charAt(0); String res = "" + s.charAt(0);
        for (int i =1;i < s.length() ; i++){
            if (s.charAt(i) != s.charAt(i -1)){
                cnt++;
                ans += s.charAt(i);
            } else{
                if (cnt > dem){
                    dem = cnt;
                    res = ans;
                } else if(cnt == dem && ans.compareTo(res) > 0){
                    res = ans;
                }
                cnt =1;
                ans = "" + s.charAt(i);
            }
        }
        System.out.print(ans);
    }
}
