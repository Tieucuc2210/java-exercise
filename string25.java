import java.util.Scanner;

public class string25 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int m = cs.nextInt();
        int s = cs.nextInt();
        int[] lon = new int[m];
        int[] be = new int[m];
        if (s > m * 9 || (m > 1 && s == 0)) System.out.println("no");
        else{
            int t = s;
            for (int i =0 ;i < m ; i++){
                if(s >= 9){
                    lon[i] = 9;
                    s -= 9;
                } else{
                    lon[i] = s;
                    s = 0;
                }
            }
            t--;
            for (int i= m -1;i > 0 ; i--){
                if (t >= 9){
                    be[i] = 9;
                    t -= 9;
                } else{
                    be[i] = t;
                    t = 0;
                }
            }
            be[0] = t + 1;
            for (int x : lon){
                System.out.print(x);
            }
            System.out.println(" ");
            for (int x : be){
                System.out.print(x);
            }
        }
    }
    public static void solon(int m , int s){
        String res = "\\s+";
        for (int i =0 ;i < m ;i++){
            if(s >= 9){
                res = "9" + res;
                s -=9;
            } else {
                res = s + res;
                s =0;
            }
        }
        System.out.print(res);
    }
    public static void sobe(int m , int s){
        String res = " ";
        m--;
        s--;
        for (int i =0; i < m ;i++){
            if (s >= 9){
                res += "9";
                s -= 9;
            } else{
                res = s + res;
                s =0;
            }
        }
        s += 1;
        res = s + res;
        System.out.print(res);
    }

}
