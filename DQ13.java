import java.util.Scanner;

public class DQ13 {
    public static  int tong(int n){
        if (n < 10){
            return  n;
        } else{
            return  n % 10 + tong(n /10);
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(tong(n));
    }
}
