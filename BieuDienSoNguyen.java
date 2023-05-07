import java.util.Scanner;

public class BieuDienSoNguyen {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (n == 1){
            System.out.println("-1");
        } else if (n % 2== 0){
            System.out.println(n / 2);
            for (int i =0 ;i < n /2;i++){
                System.out.print(2 + " ");
            }
        } else {
            System.out.println(n /2);
            for (int i =0 ;i < n /2 -1; i++){
                System.out.print(2 + " ");
            }
            System.out.print("" + 3);
        }
    }
}
