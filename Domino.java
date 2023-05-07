import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        if (a % 2== 0){
            System.out.println(a / 2 * b);
        } else{
            System.out.println((a-1) /2 * b + b / 2);
        }
    }
}
