import java.util.Scanner;

public class SoSmith {

    public static  int tong(int n){
        int sum =0;
        while (n != 0){
            sum += n  % 10;
            n /= 10;
        }
        return sum;
    }
    public static  int smith(int n){
        int tong1 = tong(n);
        int tmp = n;
        int tong2 =0;
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                while (n % i == 0){
                    tong2 += tong(i);
                    n /= i;
                }
            }
        }
        if (tmp== n) return 0;
        if (n != 1) tong2 += tong(n);
        return tong1 == tong2 ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        if (smith(n) ==1) System.out.println("yes");
        else System.out.println("no");
    }
}
