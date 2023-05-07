import java.util.Scanner;

public class Dq12 {
    public  static  void doi(int n){
        if (n != 0){
            doi(n /16);
            int res = n % 16;
            if (res < 10){
                System.out.print(res);
            } else{
                System.out.print((char)(res + 55));
            }
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        if (n == 0) System.out.println(0);
        else doi(n);
    }
}
