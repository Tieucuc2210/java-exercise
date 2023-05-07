import java.util.Scanner;

public class DQ11 {
    public  static  void chuyen(int n){
        if (n != 0){
            chuyen(n/2);
            System.out.print(n % 2);
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (n == 0) {
            System.out.println(0);
        } else{
            chuyen(n);
        }
    }
}
