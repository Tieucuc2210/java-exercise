import java.util.Scanner;

public class TongUoc1 {
    public  static  int tong(int n){
        int sum =0;
        for (int i =1; i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                sum += i;
                if (i != n / i){
                    sum += n / i;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(tong(n));

    }
}
