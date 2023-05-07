import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int x = cs.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            int z = cs.nextInt();
            v.add(z);
        }
        boolean ok = false;
        int id = 0;
        for (int i =0 ; i < v.size() ; i++){
            if (v.get(i) == x){
                ok = true;
                id = i;
                break;
            }
        }
        v.remove(id);
        if (ok){
            for (int d : v){
                System.out.print(d + " ");
            }
        } else{
            System.out.println("found");
        }

    }
}
