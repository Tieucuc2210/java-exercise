import java.util.Scanner;

public class Caudk {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        // n co phai so chan hay k
        if (n % 2 == 0){
            System.out.println("YES");

        } else{
            System.out.println("NO");
        }
        //N có phải là số vừa chia hết cho 3 vừa chia hết cho 5? (Kết hợp 2 điều kiện sử dụng &&)
        if (n % 2 == 0 && n % 5 == 0){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        //N có phải là số chia hết 3 nhưng không chia hết cho 7?
        if (n % 3 == 0 && n % 7 != 0){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        //4
        if (n % 3 == 0 || n % 7 == 0){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
        //5
        if (n >= 30 && n <= 50){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        //6
        if (n >= 30 && (n % 3 == 0 || n % 2 == 0 || n % 5 == 0 )){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        //7
        int ans = n % 10;
        if ((n >= 10 && n <= 99) && (ans == 2 || ans == 3 || ans == 5 || ans == 7)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        if (n > 100 && n % 23 == 0){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        if (n < 10 || n > 20){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        if (ans % 3 == 0){
            System.out.println("YES");
        } else{
            System.out.println("no");
        }
    }
}
