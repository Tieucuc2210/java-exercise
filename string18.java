import java.util.Scanner;

public class string18 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while(t-- > 0){
            String s = cs.nextLine();
            int ans =s.length();
            for (int i =0 ;i < s.length() ;i++){
                for (int j =i +1 ;j < s.length() ; j++){
                    if (s.charAt(i) == s.charAt(j)){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

}
