import java.util.Scanner;

public class PhanTichTNT {


    public  static  void check(int n){
        for (int i =2 ; i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                int cnt =0;
                while (n % i == 0){
                    cnt += 1;
                    n /= i;
                }
                System.out.print(i + "^" + cnt + " ");
                if (n != 1) System.out.print(" * ");
                else System.out.print(" ");
            }
        }
        if (n != 1) System.out.print(n + "^"+ "1");
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        check(n);
    }
}
