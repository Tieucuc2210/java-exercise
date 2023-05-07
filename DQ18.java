import java.util.Scanner;

public class DQ18 {
    public static int chan(int n){
        if (n == 0){

            return 0;
        } else if ((n% 10) % 2== 0) return n % 10 + chan(n /10);
        else return  chan(n/10);
    }

    public static int le(int n){
        if (n == 0){
            //System.out.println(n + " ");
            return 0;
        } else if ((n% 10) % 2 !=0 ) return n % 10 + le(n /10);
        else return  le(n/10);
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(le(n));
        System.out.println(chan(n));
    }
}
