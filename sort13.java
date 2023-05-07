import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class sort13 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        Integer[] a= new Integer[n];
        for(int i=0 ;i < n;i++){
            a[i] = cs.nextInt();
        }
        Arrays.sort(a , new Comparator<Integer>(){
            @Override
            public int compare(Integer o1 , Integer o2){
                return -Integer.compare(o1 , o2);
            }
        });
        int ans = a[0];
        int cnt =1;
        for (int  i =1 ; i < n ;i++){
            if (ans >= 1){
                cnt+=1;

            } else{
                break;
            }
            ans = Math.max(ans -1 , a[i]);
        }
        System.out.println(cnt);
    }
}
