import java.util.Scanner;

public class Ares {
    //Kiểm tra n là số nguyên tố, nếu đúng in 1, sai in 0.
    public  static  int nt(int n){
        for (int i =2;i <= Math.sqrt(n) ;i++){
            if (n % i == 0) return 0;
        }
        return n>1 ? 1 : 0;
    }
    // In tổng chữ số của n.
    public  static  int tong(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    //In tổng chữ số chẵn của n.
    public static  int chan(int n){
        int sum =0;
        while (n != 0){
            int res = n % 10;
            if (res % 2== 0) sum += res;
            n /= 10;
        }
        return sum;
    }
    //In tổng chữ số của n là số nguyên tố.
    public  static  int ham4(int n){
        int sum = 0;
        while ( n != 0){
            int r = n % 10;
            if (r == 2 || r == 3 || r == 5 || r == 7) sum += r;
            n /= 10;
        }
        return  sum;
    }
    //In số lật ngược của n. Ví dụ 123 in 321.
    public  static  int ham5(int n){
        int rev =0;
        while (n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return  (int)rev;
    }
    // In số lượng ước của n là số nguyên tố (làm tương tự như phân tích thừa số ng tố).
    public static  int ham6(int n){
        int dem =0;
        for (int i =2;i <= Math.sqrt(n) ;i++){
            dem +=1;
            if (n % i == 0){
                while ( n % i == 0){

                    n/=i;
                }
            }
        }
        if (n > 1) dem +=1;
        return  dem;

    }
    //In ước nguyên tố lớn nhất của n (làm tương tự như phân tích thừa số ng tố).
    public  static int ham7(int n){
        int ans =0;
        for (int i =2;i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                ans= i;
                while (n % i == 0){
                    n /= i;
                }
            }
        }
        if (n != 1) ans = n;
        return  ans;
    }
    // Kiểm tra nếu n tồn tại ít nhất 1 số 6, nếu đúng in 1, sai in 0.
    public static  int ham8(int n){
        int cnt =0;
        while (n != 0){
            int res = n % 10;
            if (res == 6) cnt += 1;
            n /= 10;
        }
        return cnt >=1 ? 1 : 0;
    }
    //Kiểm tra nếu tổng chữ số của n chia hết cho 8, nếu đúng in 1, sai in 0.
    public static int ham9(int n){
        int sum =0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        if (sum % 8 == 0) return  1;
        else return  0;
    }
    //Tính tổng giai thừa các chữ số của n và in ra. Ví dụ n = 123, tổng = 1! + 2! +3!
    public static int gt(int n){
        if(n == 1) return 1;
        else return n * gt(n-1);
    }
    public static int ham10(int n){
        int sum =0;
        while (n != 0){
            int res = n % 10;
            sum += gt(res);
            n/=10;
        }
        return  sum;
    }
    //Kiểm tra n có phải chỉ được tạo bởi 1 số hay không? Ví dụ 222, 333, 99999. Đúng in ra 1, sai in ra 0.
    public static int ham11(int n){
        int res = n % 10;
        while (n != 0){
            if (res != n % 10) return 0;
            n /= 10;
        }
        return  0;
    }
    //Kiểm tra n có phải có chữ số tận cùng là lớn nhất hay không
    public static int ham12(int n){
        int p = n % 10;
        while (n != 0){
            int res = n % 10;
            if (res > p) return 0;
            n /= 10;
        }
        return  1;
    }
    //In tổng lũy thừa chữ số của n với số mũ là số chữ số.
    public static int dem(int n){
        int cnt =0;
        while (n != 0){
            cnt += 1;
            n /= 10;
        }
        return cnt;
    }
    public static int ham13(int n){
        int sum = 0;
        int read = dem(n);
        while (n != 0){
            int res = n % 10;
            sum += Math.pow(n % 10 , read);
            n /= 10;
        }
        return  sum;
    }
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        System.out.println(nt(n));
        System.out.println(tong(n));
        System.out.println(chan(n));
        System.out.println(ham4(n));
        System.out.println(ham5(n));
        System.out.println(ham6(n));
        System.out.println(ham7(n));
        System.out.println(ham8(n));
        System.out.println(ham9(n));
        System.out.println(ham10(n));
        System.out.println(ham11(n));
        System.out.println(ham12(n));
        System.out.println(ham13(n));
    }
}
