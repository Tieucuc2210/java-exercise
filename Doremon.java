import java.util.Scanner;

public class Doremon {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        int x = 0 ,  y = a;
        if (a % 2 == 0){
            x = a / 2;
        } else{
            x = a / 2 +1;
        }
        int ans =(x - b + 1) / b * b;
        if (y <= ans){
            System.out.println(ans);
        } else{
            System.out.println("-1");
        }
    }
}
