import java.util.HashSet;
import java.util.Scanner;

public class sort1 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int [] a= new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i < n;i++){
            a[i] = cs.nextInt();
            set.add(a[i]);
        }
        System.out.println(set.size());
    }
}
