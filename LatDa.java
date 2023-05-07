import java.util.Scanner;

public class LatDa {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int s = cs.nextInt();
        int x =0 , y = 0;
        if (n % s== 0){
            x = n / s;
        } else{
            x = n / s + 1;
        }
        if (m % s == 0){
            y = m / s;
        } else{
            y = m / s + 1;
        }
        System.out.println(x * y);
    }
}
