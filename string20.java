import java.util.Scanner;

public class string20 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        String t = "python";
        int cnt =0;
        for (char x : s.toCharArray()){
            if(x == t.charAt(cnt)){
                cnt++;
            }
            if (cnt == 6){
                System.out.println("yes");
                System.exit(0);
            }
        }
        System.out.println("no");
    }
}
