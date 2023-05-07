import java.util.Scanner;

public class Array13 {
    public static void main(String[] args) {


        Scanner cs = new Scanner(System.in);
        long n = cs.nextLong();
        long[] a = new long[(int) n];

        for (int i = 0; i < n; i++) {
            a[i] = cs.nextLong();
        }



        long tong =0; long tich =1;
        for (int i =0 ;i < n ;i++){
            tong += a[i];
            tong %= 1e9 + 7;
            tich *= a[i];
            tich %= 1e9 + 7;
        }
        System.out.println(tong + " " + tich);

    }
}
