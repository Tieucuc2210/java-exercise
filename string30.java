import java.util.*;

public class string30 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        String s= cs.nextLine();
        s += 'a';
        String res ="";
        ArrayList<String> v = new ArrayList<>();
        for (int i =0 ;i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                res += c;
            } else{
                while (res.length() > 0 && res.charAt(0) == '0'){
                    res = res.substring(1);
                }
                if (!res.equals("")){
                    v.add(res);
                }
                res = "";
            }
        }
        Collections.sort(v, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String ab = o1 + o2;
                String ba = o2 + o1;
                return -ab.compareTo(ba);
            }
        });
        for (String x : v){
            System.out.print(x);
        }
    }
}
