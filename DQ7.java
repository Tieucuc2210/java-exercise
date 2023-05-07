import java.util.Scanner;

public class DQ7 {
    public  static  int th(int n , int k){
        if (n == k || k == 0) return  1;
        else return  th(n-1 , k-1) + th(n-1 , k);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        System.out.println(th(n , k));
    }
}
