# JAVA - Syntax Cơ Bản

- Phân biệt chữ hoa, chữ thường ( Case Sensitive ).
- Program File Name = Class Name.  
> Tuy nhiên nếu trong file ***không*** có `public class` thì Program File Name có thể không trùng với Class Name.

## **1. Nhập, xuất**  

### **`*` Xuất :**

| Syntax | Đặc điểm |
| -- | -- |
| System.out.printfln("") | Con trỏ chuột nhảy xuống dòng tiếp theo |
| System.out.print("") | Con trỏ chuột *không* xuống dòng |
| System.out.printf("") | Giống trong C |


### **`*` Nhập :**  
- Cần import `java.util.Scanner` có chứa class `Scanner ` 

```java
import java.util.Scanner
```
- Tạo một đối tượng của lớp Scanner  
```java
Scanner input = new Scanner(System.in);
string name = input.nextLine();
```
| Kiểu | Đặc điểm |
| -- | -- |
| next() | Đọc một string kết thúc bằng *space* hoặc *enter* ( giống cin string trong C++ ) |
| nextLine()  | Đọc string kết thúc bằng *enter* ( giống getline(cin) trong C++ ) |
| nextInt() / nextFloat() | Đọc kiểu int / float |

### `*` **Nhập, xuất File :**

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("Hello.txt"));
        while(input.hasNextLine()){
            String s = input.nextLine();
            System.out.println(s);
        }
        input.close();
    }
}
```

## **2. Thân chương trình**
Có thể khai báo hàm main theo các cách :  

```java
public static void main(String args[])
public static void main(String[] args) // preferred way
public static void main(String []args)
```
hoặc
```java
static public void main(String args[])
```
hoặc
```java
public static void main(String... args)
```

- Sử dụng `static` có lợi thế là *không* cần tạo ra đối tượng để gọi đến hàm `main`

## **3. Biến (Variables)**
Gồm 3 loại :
- Local 
- Instance
- Static/Class

### `*` **Local Variables :** 
- Khai báo trong `method`, `constructor`, `block` và bị hủy khi `method`, `constructor`, `block` bị hủy.
- ***Không*** dùng `access modifier`.
- Phải khởi tạo giá trị ban đầu trước khi sử dụng.


### `*` **Local Variables :** 
- Khai báo trong class nhưng ***ngoài*** `method`, `constructor`, `block`.
- Được tạo ra khi một `object` được tạo với keyword `new` và bị hủy khi `obbject` bị hủy.
- Đã được khởi tạo giá trị mặc định khi tạo ra.

### `*` **Static/Class Variables :** 
- Khai báo trong class nhưng ***ngoài*** `method`, `constructor`, `block`.
- Được tạo ra duy nhất một lần khi chương trình chạy và chỉ bị hủy khi chương trình kết thúc.
- Đã được khởi tạo giá trị mặc định khi tạo ra.

## **4. Toán tử (Operators)**

Chuyển từ `string` về các kiểu dữ liệu khác :

```java
string s = "100";
int a = Integer.parseInt(s);
```

Chuyển từ các kiểu dữ liệu khác về `string` :
```java
int a = 100;
string s1 = String.valueOf(a);
string s2 = Integer.toString(a);
```
## **5. If else**

## **6. Vòng lặp for**

- for(init, condition, increment){}
```java
for(int i = 0; i < 10; i++){

}
```

- for( type_variables : array){}
```java
int a[] = {1, 2, 3};
for(int i : a){

}
```

- labelName: for(init, condition, increment){}  
-> Hữu dụng khi dùng các lệnh `break`/`continue`.
```java
a : for(int i = 1; i <= 10; i++){
    b : for(int j = 1; j <= 10; j++){
        if(i == j){
            break a;
        }
    }
}  
```

## **7. Array ( Mảng )**  

 (data_type)**[]** (array_name) **= new** (data_type) **[** (array_size) **] ;**

 ```java
 int[] a = new int[10];
 ```
## **8. Note**

- Khi muốn trỏ đến kí tự trong String thì phải dùng charAt().
- Trong Java không có tự động mặc định là đúng như trong C++
``` java
while(T-- > 0)
```

## **9. Wrapper Class**
- Chuyển từ `primitive` data types sang `objects` ( khi cần sửa giá trị của biến thông qua dùng hàm vì `primitive` chỉ pass by value )
- Collections chỉ lưu trữ objects
- in `java.lang` package
 
| Primitive Type | Wrapper Class |  
| -- | -- |  
| boolean | Boolean |
| char | Character |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float | 
| double | Double |

- Chuyển từ `primitives` sang `objects`
``` java
int a = 10;
Integer i = a; // autoboxing
```

- Chuyển từ `objects` về `primitives`
```java
Integer a = new Integer(3);
int i = a;
```

## **10. String Class**
| Hàm | Công dụng |
| -- | -- |
| int length() | |
| char charAt(int index) | |
| int compareTo(Object O) | return = 0 nếu bằng nhau,    return > 0 nếu string đang xét lớn hơn O, return < 0 nếu string đang xét nhỏ hơn O |
| boolean equals(Object O) | return true nếu bằng nhau  return false nếu khác nhau |
| String trim() | return String mà được xóa space/tab ở đầu dòng và cuối dòng. |
| String substring(int beginIndex, int endIndex) | 
| String[] split(String regex) | tách String đang xét bằng các regex -> return mảng String |

## **11. Math Class**

- import java.lang.Math
- Khi cần gọi hàm nào thì chỉ cần Math. + hàm cần gọi

## **12. Regex** ( Regular Expression )
- in java.util.regex  

Regular Expression Syntax
| | |
| -- | -- |
| [abc] | Chứa kí tự bất kì trong [] |
| [^abc] | Không chứa bất kì kí tự nào trong [] |
| [a-zA-Z] | a - z hoặc A - Z |
| [a - c[d - f]] | a - c hoặc d - f |
| X? | X xảy ra một lần hay không xảy ra lần nào |
| X+ | X xảy ra >= 1 |
| X* | X xảy ra >= 0 |
| X{n} | X chỉ xảy ra n lần |
| X{n,} | X xảy ra >= n |
| X{x, y} | X xảy ra >= x và < y |
| . | Bất kì kí tự nào |
| \d | [0, 9] |
| \D | [^0, 9] |
| \s | whitespace |
| \w | [a-zA-Z_0-9] |


Pattern Class

| Hàm | Công dụng | Ví dụ |
| -- | -- | -- |
| Pattern compile(String regex) | chuyển String -> Pattern ( cách tạo Pattern) | Pattern pattern = Pattern.compile("abc") |
| String pattern() |   |  |
| Matcher matcher(String input) | Tạo matcher object |Matcher matcher = pattern.matcher(input) |

Matcher Class

| Hàm | Công dụng | Ví dụ |
| -- | -- | -- |
| boolean find() | tìm trong input biểu thức tiếp theo khớp với pattern  |  |
| String group() | trả về chuỗi con phù hợp | | 


## **1. Encapsulation**

- Các biến sẽ để ở private
- Sử dụng getter and setter để truy cập 


## **2. Inheritance**

``` java
class BaseClassName {

}

class SubClassName extends BaseClassName{

}
```
- Java : chỉ có thừa kế `public` .  
C++ : thừa kế `public`, `private`, `protected`.

- `super.` + BaseClassVariable : gọi đến biến của lớp cha.
- `super.` + BaseClassFunctionName + `()` :  để gọi đến phương thức ở lớp cha.
- `super(`// có thể không có hoặc có nhiều tham số`)` : gọi `constructor` của `base_class`.

## **3. Polymorphism**

- Overloading
- Overriding : định nghĩa lại hàm đã có trong BaseClass.
``` java
class BaseClass {
    void run() {
        System.out.println("Base Class");
    }
}
 
public class SubClass extends BaseClass {
    void run() {
        System.out.println("Sub Class");
    }
 
    public static void main(String args[]) {
        BaseClass b = new SubClass();// upcasting
        b.run();
    }
}
// -> Output : Sub Class
```
> Không overidding với variable

## **4. Common Modifiers**
| Access Modifier | Function |
| -- | -- |
| Private | Chỉ access trong class. | 
| Default | Chỉ trong package. |  
| Protected | Chỉ trong package and ngoài package thông qua child class. |
| Public | Cái nào cũng được. |

## **5. Stactic Modifier**
- Chỉ sử dụng bộ nhớ 1 lần để lưu biến static. 
- Phương thức static thuộc class  
Không cần tạo instance   
Có thể dùng để truy cập và thay đổi biến static.
- Khối static dùng để khởi tạo các dữ liệu static.

## **6. Interface**
- Tập hợp các phương thức abstract.
- Không thể khởi tạo constructor
- Variable : public static final
- Method : public abstract 

## **7. Abstract Class**
- Chứa phương thức abstract.
- Khi class khác kế thừa abstract class thì phải overidding các abstract method của abstract class.
- Không thể tạo instance cho abstract class.
- Phương thức của abstract chỉ có tên, tham số chứ không có thân.
- Access modifier của các hàm của abstract phải ở public hoặc protected để lớp kế thừa có thể định nghĩa lại và các thuộc tính của lớp abstract 















