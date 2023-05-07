import java.util.*;

public class LiThuyetMap {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
//        Map<String , String> map = new HashMap<>();
//        map.put("thang" , "nguyen");
//        map.put("ronal" , "do");
//        map.put("messi" , "ro");
//        map.put("draven" , "top1");
//        map.put("yasuo" , "map2");
//        //System.out.println(map.get("thang"));
//        //System.out.println(map.size());
////        if (map.isEmpty()) System.out.println("found");
////        else System.out.println("not");
////       map.remove("draven");
//        map.replace("yasuo" , "ok thang");
//
//       for (Map.Entry<String , String> x : map.entrySet()){
//           System.out.println(x.getKey() + " " + x.getValue());
//       }

//        String s = cs.nextLine(); vidu 1
//        Map<Character , Integer> v = new HashMap<>();
//        for (int i =0; i < s.length() ; i++){
//            if (v.containsKey(s.charAt(i))){
//                int cnt = v.get(s.charAt(i));
//                cnt++;
//                v.put(s.charAt(i) , cnt);
//            } else{
//                v.put(s.charAt(i) ,1);
//            }
//        }
//
//        for (Map.Entry<Character , Integer> x  : v.entrySet()){
//            System.out.println(x.getKey() + " " + x.getValue());
//        }
//
        // treemap:

        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        TreeMap<Integer ,Integer> v= new TreeMap<>();
        for (int i =1 ;i <= 10; i+=2){
            v.put(i , 2 * i);
        }
        for (Map.Entry<Integer , Integer> x : v.entrySet()){
            System.out.println(x.getKey() + " " + x.getValue());
        }
        System.out.println(v.lowerKey(3));
        System.out.println(v.floorKey(3));
        System.out.println(v.ceilingKey(3));
        System.out.println(v.higherKey(3));
    }
}
