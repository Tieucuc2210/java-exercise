import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sort3 {
    public static int check(int n){
        int sum =0;
        while (n != 0){
            sum += n % 10;
            n/= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        Integer[] a = new Integer[n+1];

        for (int i =0 ;i < n ;i++){
            a[i] = cs.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int x = check(o1);
                int y = check(o2);
                if (check(o1) == check(o2)){
                    return Integer.compare(o1 , o2);
                } else return Integer.compare(x , y);
            }
        });
        for (int x : a){
            System.out.print(x + " ");
        }
    }
}
