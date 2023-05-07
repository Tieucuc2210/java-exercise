import java.util.Scanner;

public class fibo4 {
    public  static int nt(int n){
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if (n  % i == 0) return 0;
        }
        return n>1 ? 1 : 0;
    }
    public  static  int fibo(int n){
        if (n == 1) return 1;
        int f1 =1 , f2 =1 , f3 =0;
        for (int i =2 ; i < 23 ; i++){
            f3 = f2 + f1;
            if (f3 == n) return 1;
            f1 =f2;
            f2 = f3;
        }
        return 0;
    }
    public  static  int tong(int n){
        int sum =0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n= cs.nextInt();
        for (int i =0 ;i < n ;i++){
            if (nt(i) ==1 && fibo(tong(i)) == 1){
                System.out.print(i + " ");
            }
        }
    }
}
