import java.util.Scanner;

public class SoNguyenTo {
    public static  int nt(int n){
        if (n < 2) return 0;
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if(n % i == 0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        if (nt(n) ==1) System.out.println("YES");
        else System.out.println("No");
    }
}
