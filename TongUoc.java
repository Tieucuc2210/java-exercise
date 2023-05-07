import java.util.Scanner;

public class TongUoc {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int sum =1;
        for (int i =1;i <= n ; i++){
            if (n % i == 0){
                sum *= i;
                System.out.print(i + " ");
            }
        }
        System.out.println(sum);
    }
}
