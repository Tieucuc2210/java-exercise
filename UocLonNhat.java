import java.util.Scanner;

public class UocLonNhat {
    public static  int check(int n){
        int ans = -1;
        for (int i =2 ; i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                ans = i;
                while (n % i == 0){
                    n /= i;
                }
            }
        }
        if (n != 1) ans = n;
        return ans;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while (t-- > 0){
            int n = cs.nextInt();
            System.out.println(check(n));
        }
    }
}
