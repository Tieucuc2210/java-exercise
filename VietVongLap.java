import java.util.Scanner;

public class VietVongLap {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        for (int i =1 ;i <= n ;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i =n ; i >= 0 ;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i =0 ;i < n ; i += 2){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1;i <= n ; i+= 2){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=0 ;i < n ;i++){
            System.out.print((char)(i + 97) + " ");
        }
        System.out.println();
        for (int i = 122 - n + 1;i < 123 ; i++){
            System.out.print((char)(i) + " ");
        }
    }
}
