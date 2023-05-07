import java.util.Scanner;

public class Array2 {

    public static  int check(int n){
        for (int i =2;i <= Math.sqrt(n) ;i++){
            if (n % i == 0) return 0;
        }
        return n>1?1 :0;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int[] a = new int[n];
        for (int i=0;i <n ;i++){
            a[i] = cs.nextInt();
        }
        int cnt =0 , sum =0;
        for (int i=0 ;i < n;i++){
            if(check(a[i]) == 1){
                cnt +=1;
                sum += a[i];
            }
        }
        double res =  sum / cnt;
        System.out.printf("%.3f" , res);
    }
}
