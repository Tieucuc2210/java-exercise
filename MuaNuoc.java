import java.util.Scanner;

public class MuaNuoc {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int s = cs.nextInt();
        if (m <= s/2){
            System.out.println(n * m);
        } else{
            if (n % 2 == 0){
                System.out.println(n /2 * s);
            } else{
                System.out.println((n-1) / 2 * s + m);
            }
        }

    }
}
