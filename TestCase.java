import java.util.Scanner;

public class TestCase {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while (t-- > 0){
            int n = cs.nextInt();
            if (n % 2 == 0){
                System.out.println("even");
            } else{
                System.out.println("0dd");
            }
        }
    }
}
