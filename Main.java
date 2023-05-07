import java.util.Scanner;

// co ban :

public class Main {
    public  static  int gt(int n){
        if (n == 1) return 1;
        else return n * gt(n-1);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int z1 = gt(n);
        int z2 = gt(m);
        int res = Math.min(z1 , z2);
        System.out.println(res);
    }
}