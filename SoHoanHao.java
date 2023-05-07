import java.util.Scanner;

public class SoHoanHao {
    public  static  int shh(int n){
        int sum = 1;
        int rev = n;
        for (int i =1;i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                sum += i;
                if (i != n / i) sum += n /i;
            }
        }
        return sum == rev ? 1: 0;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        if (shh(n) == 1) System.out.println("yes");
        else System.out.println("no");
    }
}
