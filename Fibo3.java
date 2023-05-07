import java.util.Scanner;

public class Fibo3 {
    public  static  int check(int n){
        int f1 =0 , f2 = 1;
        int f3 = 0;
        for (int i =2; i < 24 ; i++){
            f3 = f1 + f2;
            if (f3 >= n) return  f3;
            f1 =f2;
            f2 = f3;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(check(n));
    }
}
