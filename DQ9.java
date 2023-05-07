import java.util.Scanner;

public class DQ9 {
    public  static  int lt(int n , int k){
        if (k == 0) return  1;
        int tmp = lt(n , k /2);
        if (k % 2 == 1) return  tmp * tmp *n;
        else return tmp * tmp;
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        System.out.println(lt(n , k));
    }
}
