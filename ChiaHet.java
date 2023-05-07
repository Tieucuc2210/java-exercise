import java.util.Scanner;

public class ChiaHet {
    public  static  boolean check(int n){
        for (int i =0 ;i < n /111 +1 ; i++) {
            if ((n - i * 111) % 11 == 0) return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (check(n)) System.out.println("yes");
        else System.out.println("no");

    }
}
