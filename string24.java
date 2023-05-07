import java.util.Scanner;

public class string24 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s = cs.nextLine();
        int[] cnt = new int[256];
        for (int i =0 ;i < s.length() ; i++){
            cnt[(int) s.charAt(i)]++;
        }
        int ans =s.length();
        for (int i =0 ; i < 256 ; i++){
            if (cnt[i] != 0){
                ans += cnt[i] * (cnt[i] -1) /2;
            }
        }
        System.out.println(ans);
    }
}
