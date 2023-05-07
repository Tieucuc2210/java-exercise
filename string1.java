import java.util.Scanner;

public class string1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        int cnt1 = 0 , cnt2 =0;
        for (char x : s.toCharArray()){
            if (Character.isAlphabetic(x)){
                cnt1++;
            } else if (Character.isDigit(x)) cnt2++;
        }
        int z = s.length() - cnt1 - cnt2;
        System.out.println(cnt1 + " " + cnt2 + " " + z);
    }
}
