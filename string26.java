import java.util.Scanner;

public class string26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s += '#';
        int cnt =1 , dem =1;
        String ans = "" +  s.charAt(0) ,  res  = "" + s.charAt(0);
        for (int i =1 ; i < s.length() ; i++){
            if (s.charAt(i) == s.charAt(i-1)){
                cnt++;
                ans += s.charAt(i);
            } else {
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
