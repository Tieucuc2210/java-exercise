import java.util.Scanner;

public class UocBoi {
    public  static  int gdc(int a , int b){
        if (b == 0){
            return a;
        } else return gdc(b , a % b);
    }
    public  static  int lcm(int a , int b){
        return a * b / gdc(a , b);
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int a = cs.nextInt();
        int b = cs.nextInt();
        System.out.println(gdc(a , b ) + " " + lcm(a ,b));
    }
}
