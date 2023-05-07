import java.util.Scanner;

public class DQ16 {

    public static int so_lon(int n){
        if (n < 10){
            return  n;

        } else{
            return  Math.max(n % 10 , so_lon(n /10));
        }
    }
    public static int so_be(int n){
        if (n < 10){
            return  n;

        } else{
            return  Math.min(n % 10 , so_be(n /10));
        }
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(so_lon(n) + " " + so_be(n));
    }
}
