import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class dir13 {
    public  static int skk(int n){
        int r = n % 10;
        while (n != 0){
            if (n % 10 <= r) return 1;
            n/= 10;
        }
        return  0;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        TreeMap<Integer , Integer> v =new TreeMap<>();
        while (cs.hasNextInt()){
            int x = cs.nextInt();
            if (skk(x) == 1){
                if (v.containsKey(x)){
                    int cnt = v.get(x);
                    cnt++;
                    v.put(x , cnt);
                } else{
                    v.put(x , 1);
                }
            }
        }
    }
}
