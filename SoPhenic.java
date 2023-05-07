import java.util.Scanner;

public class SoPhenic {

    public  static  long check(long n){
        int ans = 0;
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                int cnt = 0;
                while (n % i == 0){
                    cnt += 1;
                    n /= i;
                }
                if (cnt >= 2) return 0;
                if(cnt ==1) ans += 1;
            }
        }
        if (n!= 1) ans += 1;
        return ans >= 3 ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        long n = cs.nextLong();
        if (check(n) == 1){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
