import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class AD24 {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();

        int[][] a = new int[n][n];
        for (int i =0 ;i < n ;i++){
            for (int j =0 ; j < n;j++){
                a[i][j] = cs.nextInt();
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;i < n;i++){
            set.add(a[0][i]);
        }
        for(int i=1;i < n ;i++){
            HashSet<Integer> tmp = new HashSet<>();
            for (int j =0 ;j < n ;j++){
                if (set.contains(a[i][j])){
                    tmp.add(a[i][j]);
                }
            }
            set = tmp;
        }
        if (set.isEmpty()){
            System.out.println("not found");
        } else{
            ArrayList<Integer> p = new ArrayList<>(set);
            Collections.sort(p);
            for (int x : p){
                System.out.print(x +  " ");
            }

        }
    }
}
