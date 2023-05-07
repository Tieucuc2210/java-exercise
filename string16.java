import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class string16 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        String ns = cs.nextLine();
        String[] arr = s.split("\\s+");
        for(int i =0 ;i < arr.length ;i++){
            String wok = arr[i];
            String Dau = wok.substring(0 ,1);
            String Cuoi = wok.substring(1);
            arr[i] = Dau.toUpperCase() + Cuoi.toLowerCase();
        }
        String res = String.join(" ",arr);
        System.out.println(res);
        System.out.println(" ");
        StringBuilder pp = new StringBuilder(ns);
        if(ns.charAt(1) == '/'){
            ns = '0' + ns;
        }
        if(ns.charAt(4) == '/'){
            ns = ns.substring(0 ,3) + '0' + ns.substring(3);
        }
        System.out.println(ns);
    }
    public static String check(String s){
        StringBuilder p = new StringBuilder();
        String[] arr = s.split(" ");
        for (String x : arr){
            if (x.length() > 0){
                p.append(Character.toUpperCase(x.charAt(0)));
                p.append(x.substring(1));
            }
            p.append(" ");
        }
        return p.toString().trim();
    }
}
