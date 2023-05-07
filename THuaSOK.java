import java.util.Scanner;

public class THuaSOK {

    public  static  int check(int n , int k){
        int res =0;
        for (int i =2 ; i <= Math.sqrt(n) ; i++){
            while ( n % i == 0){
                res +=  1;
                n /= i;
                if (res == k) return i;
            }
        }
        if (n != 1) res += 1;
        if (res == k) return n;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int k = cs.nextInt();
        System.out.println(check(n , k));
    }
}
