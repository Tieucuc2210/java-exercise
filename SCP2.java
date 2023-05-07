import java.util.Scanner;

public class SCP2 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        int m =cs.nextInt();
        int z1 = (int) Math.sqrt(n);
        int z2 = (int) Math.sqrt(m);
        for (int i = z1; i <= z2 ;i++){
            if (i *i >= n && i *i <= m){
                System.out.print(i *i + " ");
            }
        }
    }
}
