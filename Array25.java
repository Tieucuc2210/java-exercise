import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int c =0 , l =0;
        while (cs.hasNextInt()){
            int n = cs.nextInt();
            if (n % 2 == 0){
                c++;
            } else l++;
        }
        if (c > l) System.out.println("chan");
        else if (c <l) System.out.println("le");
        else System.out.println("chan+le");
    }
}
