# java-exercise




# TIP AND TRICK KHI 




## Arrays và matrix
- Cách khai báo mảng và biến ngoài main:
    + static int[] fibo = new int[(int) 93]; // mảng
    + static int n , m; // biến
-Mảng Cộng Dồn (prefix sum 1d) : áp dụng cho các bài toán tính tổng theo đoạn
Doc tham khảo : https://usaco.guide/silver/prefix-sums?lang=cpp



- Hoán Vị 2 hàng và 2 cột:


+ vói hàng , tạo 1 biến tạm để hoán đổi vd:
    int x = cs.nextInt();
    int y = cs.nextInt();
    for (int i =0 ;i < n ;i++){
    	int tmp = a[x -1][i];
    	a[x-1][i] = a[y-1][i];
    	a[y-1][i] = tmp;
    }
+ đối vói 2 cột thì tạo 1 matrix chuyển vị rồi cũng làm tương tụ như trên

- Duyệt các ô liên kề trong matrix


+ Đối Với các ô duyết các đỉnh liền kề

static int[] dx = {-1, 0, 0, 1};
static int[] dy = {0, -1, 1, 0};

static void check(int i , int j){
	a[i][j] = 0; // đánh dấu khi đã duyệt qua
	for (int k = 0;k < 4; k++){
		int i1 = i + dx[k];
		int j1 = j + dy[k];
	    // kiểm tra còn nằm trong mảng và ô duyệt kế tiếp phải là 1
	    if (i1 >= 1 && i1 <= n &&j1 <=1 && j1 <=m && a[i1][j1] == 1){
	    	check(i1 , j1); // tiếp tục nhẩy
	    }
	}
}

+ Đối với các ô duyệt các đỉnh và cạch
    static  int[] dx = {-1 , -1, -1 , 0 , 0 , 1 , 1,1 };
    static int[] dy = {-1 , 0 , 1 , -1 , 1 , -1 , 0 , 1};
+ Đối Với duyệt quân mã
    static int [] dx = {-2 ,-2 , -1 , -1 , 1 , 1 , 2 ,2};
    static int [] dy = {-1 , 1 , - 2 , 2 , -2 , 2 , -1 , 1};

+ Đối với các bài toán tìm đường đi lớn nhất hoặc ngắn nhất
        int [][] dp = new int[n+1][m+1];
        for(int i =0 ;i < n ;i++){
            for (int j=0 ;j < m ;j++){
                if (i == 0 && j == 0){ // nếu là ô đầu tiên 
                    dp[i][j] = a[i][j];
                } else if (j == 0){
                    dp[i][j] = dp[i-1][j] + a[i][j]; // chạy sang phải
                } else if  (i == 0){
                    dp[i][j] = dp[i][j-1] + a[i][j]; // xuống dưới
                } else{
                    dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]) + a[i][j]; // max giữa phải và dưới
                }
            }
        }
        System.out.println(dp[n-1][m-1]);

## Xâu Kí Tự

### Char

+ Kiểm tra xem có phải là chữ cái hay không 
 Character.isLetter(x)
+ Kiểm tra xem có phải là số không 
Character.isDigit(x);
+ Kiểm tra xem có phải là khoảng trắng hay không 
Character.isWhitespace('c')
+ Kiểm tra xem chữ cái có viết hoa hay không 
Character.isUpperCase('c')
+ kiểm tra xem chữ cái có viết thường hay không 
Character.isLowerCase('c')
+ Viết hoa kí tự 
Character.toLowerCase('c'); else Character.toUpperCase('c');

### String 

+khai báo String s = cs.nextLine(); // nếu có 1 từ lên dùng next();

+ lấy ra kí tự trong xâu : x.charArt(i);
+ So sánh 2 xâu vói nhau ta dùng hàm toCompare(); vd s1.toCompare(s2);
+ nói chuỗi ta dùng hàm concat; vd a.concat(b);
+ trả về chỉ số của kí tự Str.indexOf( 'o' );
+ Thay thế kí tự Str.replace('l', 'D') // l : chuỗi cữ , D là chuối mới
+ Kiểm tra xem chuỗi có bắt đầu bằng 1 từ gì không Str.startsWith("Tutorials")
+ Cắt Xâu str.substring('chi so bat dau' ,'chi so ket thuc');
+ chuyển đổi chuỗi thành mảng kí : for (char x : s.tocharArray());

+ viết thường s.toLowerCase();
+ viết hoa s.toUpperCase();
+ hàm toString sẽ trả về 1 chuỗi :
+ quả qua khoảng trắng đầu và cuối s.trim();


### Tách từ trong xâu

String[] arr = s.split("//s+");
String res = String.join(" " , arr)

### StringBuiler , StringToken
-StringBuiler : Nó cho phép chúng ta thực hiện các thao tác thêm, xóa và sửa đổi chuỗi một cách linh hoạt và nhanh chóng.
-cp : StringBuilder p = new StringBuilder();
các hàm trong stringbuiler : append() : nối , delete() xóa , insert(thêm phần tử ) , replace() thay thé phần tử


-StringToken : tách từ trong chuối 
String str = "This is a string to tokenize.";
StringTokenizer tokenizer = new StringTokenizer(str, " ");

while (tokenizer.hasMoreTokens()) {
    String token = tokenizer.nextToken();
    System.out.println(token);
}



## Collection
### Hàm sort : Collections.sort(a , reverOrder);

### HastSet , TreeSet , LinkerHashSet
Hiểu đơn giản nó sẽ lưu các phần từ không trùng nhau 

=ham add : them phan tu 
-ham in ra do dai : .size();
= ham contain se tra ve true neu nam trong set else se tra ve false
-ham remove() : xoa phan tu 
-ham addAll() : lay tat ca (phep hop)
-ham removeAll() : xoa tat ca (phep 1 || 2) ok!
-
- ham retainAll(): phep giao
=ham hasNext() se tra ve gia tr? boolean , true neu van con phan tu de duyet else se tra ve gia tri la
false khi khong con gia tri de duyet
- ham next se tra ve phan tu tiep theo trong colletion 

Iterator<String> iterator = mySet.iterator();

// duyệt HashSet bằng while
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}

-LinkedHashSet : theo thu tu insert vao (theo thu tu xuat hien ok )



### --TREE SET : cay do den áp dụng cho các bài toán yêu cầu sấp xếp theo thứ tự
first - lay phan tu be nhat
last - lay phan tu lon nhat
higher(x) - tra ve phan tu nho nhat lon hon x nam trong set
lower(x) - tra ve phan tu lon nhat ma nho hon bang x
ceilling(x) - tra ve phan tu nho nhat >= x trong set
floor(x) - tra ve phan tu nho nhat <= x trong set
pollLast() // xoa phan tu cuoi
set.headSet(4); // in ra cac phan tu < 4
set.tailSet(4); // in ra cac phan tu > 4


### MAP<>:::::   -- hashmap( dem tan suat xuat hien)
ham .put(): day gia tri vao map
ham .get() : tra ve gia tri value:
isEmpty() : kiem tra xem map co rong hay khong 
size() : lay do dai cua map

entrySet() - duyet qua tung cap key - value
.remove(key) - xoa 
.replace()

LinkedHashMap ( xuat hien theo thu tu xuat hien trong list);

-------------------
TreeSet (xuat hien theo thu tu tang dan)
-co the sap sep theo muon


firstKey() : lay ra key dau tien
lastKey() : lay ra key cuoi
firstEntry() : lay ra value dau tien
firstEntry() : lay ra value cuoi cung

floorKey() : lay ra phan tu nho hon hoac bang k (<=k)
lowerKey() : < k
ceilingKey() : >= k
higherKey() : >k
pollFirstEntry() : xoa phan tu dau tien trong map
