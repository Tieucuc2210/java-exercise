import java.util.Scanner;

public class Frog {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int k = cs.nextInt();
        int l =0 , r = 0;
        if (k % 2 == 0){
            l = k / 2;
            r = k / 2;
        } else{
            l = k / 2;
            r = l +1;
        }
        System.out.println(r * a - l * b);
    }
}
