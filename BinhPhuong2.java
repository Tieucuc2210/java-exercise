import java.util.Scanner;

public class BinhPhuong2 {

    public  static  int check(int n){
        for (int i= 2; i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                int dem =0;
                while (n % i == 0){
                    dem += 1;
                    n /= i;
                }
                if (dem == 1) return 0;
            }
        }
        if (n > 1) return 0;
        return 1;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        for (int i =n ; i <= m ;i++){
            if (check(i) == 1){
                System.out.print(i + " ");
            }
        }
    }
}
