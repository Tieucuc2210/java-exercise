import java.util.Scanner;
public class TamGiac {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int m = cs.nextInt();
        int c = cs.nextInt();
        /*if ( n > 0 && m > 0 && c > 0 &&(n + m > c || c + m > n || n + c > m)){
            System.out.println("yes");
        } else{
            System.out.println("No");
        }*/
        if (n > 0 && m > 0 && c > 0  &&(n +m > c || m + c > n || n + c > m)){
            if (n == m && n == c){
                System.out.println("1");
            } else if(n == m || m == c || c == n){
                System.out.println("2");
            } else if (n*n + m*m == c*c || n*n + c*c == m*m || m*m + c*c == n*n){
                System.out.println("3");
            } else{
                System.out.println("4");
            }
        } else{
            System.out.println("NO");
        }
    }
}
