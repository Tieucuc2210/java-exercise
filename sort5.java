import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sort5 {
    public class Main {
        public static void main(String[] args) {
            Scanner cs = new Scanner(System.in);
            TreeMap<Integer , Integer> v = new TreeMap<>();
            int n = cs.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = cs.nextInt();
                if (v.containsKey(a[i])){
                    int res = v.get(a[i]);
                    res++;
                    v.put(a[i] , res);
                } else{
                    v.put(a[i] , 1);
                }
            }
            int kq =0 , tx = 0;
            for (Map.Entry<Integer, Integer> x : v.entrySet()){
                if (x.getValue() > tx){
                    tx = x.getValue();
                    kq = x.getKey();
                }
            }
            System.out.println(kq + " " + tx);
        }
    }






}
