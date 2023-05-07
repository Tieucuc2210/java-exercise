import java.util.Scanner;

public class GodBack {
    public static  int nt(int n){
        for (int i =2;i <= Math.sqrt(n); i++){
            if (n % i == 0) return 0;
        }
        return n>1 ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int t = cs.nextInt();
        while (t-- > 0){
            int n =cs.nextInt();
            for (int i =2 ;i < n /2 + 1 ;i++){

                    if (nt(i) ==1 && nt(n-i) == 1){
                        System.out.println(i + " " + (n - i));

                }
            }
        }
    }
}
