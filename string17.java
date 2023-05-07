import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class string17 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String s = cs.nextLine();
        String[] arr = s.split("\\s+");
        for(int i =0; i < arr.length ;i++){
            String x = arr[i];
            String Dau = x.substring(0 ,1);
            String Cuoi = x.substring(1);
            arr[i] = Dau.toUpperCase() + Cuoi.toLowerCase();
        }
        for(int i =0 ;i <arr.length - 1;i++){
            if(i != arr.length -2){
                System.out.print(arr[i] +" ");
            } else System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length -1].toUpperCase());
        System.out.println(" ");
        ArrayList<String> p = new ArrayList<>();
        System.out.print(arr[arr.length -1].toUpperCase() +  ", ");
        for(int i =0 ;i < arr.length -2 ;i++){
            if(i != 0){
                System.out.print(" ");
            } 
            System.out.print(arr[i]);;
        }
        System.out.println(" Din [N] * H");
    }
}
