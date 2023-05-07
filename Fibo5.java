import java.util.Scanner;

public class Fibo5 {
    public  static  int tong(int n){
        if(n == 0) return  1;
        else if (n ==1) return 1;
        else{
            int f1= 0 ,f2 = 1;
            int f3 =0;
            for (int i =2;i < 22 ; i++){
                f3 = f2 + f1;
                if(f3 == n) return 1;
                f1 = f2;
                f2 = f3;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while (t-- > 0){
            int n = cs.nextInt();
            if (tong(n) == 1) System.out.println("1");
            else System.out.println("0");
        }
    }
}
