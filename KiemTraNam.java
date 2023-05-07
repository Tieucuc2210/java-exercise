
import java.util.Scanner;

public class KiemTraNam {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        if ((n >= 1 && n <= 12) && m > 0){
            if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8|| n == 10 || n == 12){
                System.out.println("31");
            } else if (n == 4 || n == 6 || n == 9 || n == 11){
                System.out.println("30");
            } else{
                if (m % 400 == 0 || (m % 4 == 0 && m % 100 != 0)){
                    System.out.println("29");
                } else{
                    System.out.println("28");
                }
            }
        } else{
            System.out.println("no");
        }
    }
}
