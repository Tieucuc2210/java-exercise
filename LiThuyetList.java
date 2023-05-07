import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class LiThuyetList {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
//        // khong luu cac phan tu trung nhau
//        HashSet<Integer> set = new HashSet<>();
//        set.add(9);
//        set.add(4);
//        set.add(1);
//        set.add(5);
////        Iterator it = set.iterator();
////        while (it.hasNext()){
////            System.out.print(it.next() + " ");
////        }
////        if (set.contains(4)) System.out.println("yes");
////        else System.out.println("no");
////        set.remove(1);
////        System.out.println(set.size());
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i=1; i <= 10 ; i++){
//            res.add(i);
//        }
//        set.addAll(res);
//        for (int x : set){
//            System.out.print( x + " ");
//        }
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//        //int n = cs.nextInt();
//        set.add(9);
//        set.add(12);
//        set.add(1);
//        set.add(3);
//        set.add(22);
//        for (int x : set){
//            System.out.print(x + " ");
//        }
        TreeSet<Integer> set = new TreeSet<>();
        int n = cs.nextInt();
        for (int i =0 ;i < n ; i++){
            set.add(cs.nextInt());
        }
//        System.out.println(set.first()); // so be
//        System.out.println(set.last()); // so lon
//        System.out.println(set.higher(5)); // phan tu nho nhat lon hon 5
//        System.out.println(set.lower(5)); // phan tu lon nhat nho hon 5
//        System.out.println(set.ceiling(5)); // phan tu nho nhat >= 5
//        System.out.println(set.floor(6)); // phan tu lon nhat <= 5
        System.out.println(set.headSet(5));
        System.out.println(set.tailSet(6));
    }
}
