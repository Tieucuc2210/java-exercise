import java.util.Scanner;

public class DQ5 {
    public  static  int check(int n){
        if(n == 1) return  1;
        else return n * check(n-1);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(check(n));
    }
}
