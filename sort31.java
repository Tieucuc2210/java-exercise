import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort31 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n  = cs.nextInt();
        int k =cs.nextInt();

        dragon[] a = new dragon[n];
        for (int i =0 ;i < n ;i++){
            int x = cs.nextInt();
            int y= cs.nextInt();
            a[i] = new dragon(x , y);
        }
        Arrays.sort(a);
        for (dragon d : a){
            if (k <= d.x){
                System.out.println("no");
                break;
            } else{
                k += d.y;
            }
        }
        System.out.println("yes");

    }

    static class dragon implements Comparable<dragon> {
        int x;
        int y;

        public dragon(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(dragon other) {
            return this.x - other.x;
        }
    }
}
