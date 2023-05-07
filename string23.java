import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class string23 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.nextLine();
        String[] arr = cs.nextLine().split(" ");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ab = o1 + o2;
                String ba = o2 + o1;
                return ba.compareTo(ab);
            }
        });
        for (String x : arr){
            System.out.print(x);
        }
    }
}
