import java.util.Scanner;

public class CS {

    public  static  boolean check(int n){
        int res= n % 10;
        while (n != 0){
            int ans = n % 10;
            if (ans > res) return  false;
            n /= 10;
        }
        return  true;
    }

    public  static  int nt(int n){
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return 0;
        }
        return n >1 ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int cnt =0;
        for (int i =0 ;i < n; i++){
            if (nt(i) == 1 && check(i)){
                cnt += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println(cnt);
    }
}
