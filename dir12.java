import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class dir12 {
    public  static  int nt(int n){
        for (int i=2 ; i <= Math.sqrt(n) ; i++){
            if (n % i == 0) return  0;
        }
        return  n>1 ?1 : 0;
    }
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        LinkedHashMap<Integer , Integer> v = new LinkedHashMap<>();
        while (cs.hasNextInt()){
            int x = cs.nextInt();
            if(nt(x) == 1){
                if (v.containsKey(x)){
                    int cant = v.get(x);
                    cant++;
                    v.put(x , cant);
                } else{
                    v.put(x , 1);
                }
            }
        }
        for (Map.Entry<Integer , Integer> x : v.entrySet()){
            //if (nt(x.getKey()) == 1){
                System.out.println(x.getKey() + " " + x.getValue());
            //}
            //System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
