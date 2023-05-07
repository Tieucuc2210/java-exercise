import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LiThuyetCompa {


    public static  class sinhvien{
        private String masv;
        private String name;
        private  String lop;
        private  float gpa;



        public sinhvien(String masv , String name , String lop , float gpa){
            this.masv = masv;
            this.name =name;
            this.lop = lop;
            this.gpa = gpa;
        }

        public float getGpa() {
            return gpa;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString(){
            return this.masv + " " + this.name + " " + this.lop + " " + String.format("%.2f" ,gpa);
        }
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<sinhvien> list = new ArrayList<>();
        for (int i =0;i < n;i++){
            String id = cs.nextLine();
            String ten= cs.nextLine();
            String lp = cs.nextLine();
            float diem = Float.parseFloat(cs.nextLine());
            list.add(new sinhvien(id , ten , lp , diem));
        }
//        Collections.sort(list, new Comparator<sinhvien>() {
//            @Override
//            public int compare(sinhvien o1, sinhvien o2) {
//                if (o1.getGpa() > o2.getGpa()){
//                    return 1;
//                } else if(o1.gpa < o2.getGpa()){
//                    return  -1;
//                } else{
//                    return  0;
//                }
//            }
//        });
        Collections.sort(list ,(sinhvien o1 , sinhvien o2)-> o1.getName().compareTo(o2.getName()));
        for (sinhvien x : list){
            System.out.println(x);
        }
    }
}
