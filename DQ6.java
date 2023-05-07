import java.util.Scanner;

public class DQ6 {
    public static  int fibo(int n){
        if (n == 1) return 0;
        else if (n == 2) return 1;
        else return  fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(fibo(n));
    }
}
