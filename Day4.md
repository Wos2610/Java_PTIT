
# Package
- Giống như một folder.
- Phải được đặt ở dòng ***đầu tiên*** của file.
- Hai packages có thể có class có tên chung nhưng khi dùng phải dùng tên đầy đủ.  
### Có 3 cách sử dụng member của package khác:
- Full-name : 
```java
graphics.Rectangle myRect = new graphics.Rectangle();
```

- Import member của package đó 
```java
import graphics.Rectangle;
...
Rectangle myRectangle = new Rectangle();
```

- Import toàn bộ package:
```java
import graphics.*;
...
Rectangle myRectangle = new Rectangle();
```

# Exception Handling
![](https://cdn.rollbar.com/wp-content/uploads/2021/07/java-exceptions-hierarchy-example.png)

![](https://lh5.googleusercontent.com/WqqNoyFEkZXfmZBBQjgIutY72_BUV6_By_BAe7Ih9u36HfelS3nTWQEYtdRUkQS32Tuhg9P9CUXo-jgvOpkO84vLm2viI4Od0BNustwONdMm7DKZnKC6kyVHyRJbsESLIPV4uBU)
- Exception là các sự kiện làm ảnh hưởng đến dòng chảy bình thường của chương trình.
- Thay vì khi gặp lỗi chương trình dừng lại thì sẽ throw exception và bên dưới tiếp tục chạy tiếp.
- Xử lý các lỗi runtime.
- Checked Exception : Được kiểm tra tại compile time.
- Unchecked Exception : Được kiểm tra tại runtime, thường do lỗi của coder. Có thể dự đoán và ngăn chặn trước.
- Error
## **Các từ khóa Exception Handling**
### 1. Khối lệnh try
- Phải được khai báo trong function.
- Phải khai báo khối lệnh `catch` hoặc `finally` hoặc cả hai.
- Nếu một câu lệnh trong `try` có lỗi thì `try` dừng ngay lập tức và nhảy vào khối `catch` tương ứng.

### 2. Khối lệnh catch
- Phải được sử dụng sau khối lệnh `try`.
- Có thể dùng nhiều `catch` cho một `try` -> Đa khối lệnh catch.
- Phải khai báo `catch` cụ thể trước rồi mới đến `catch` chung sau.

### 3. Khối lệnh finally
- Được sử dụng để đóng kết nối, đóng stream,...
- Luôn được thực thi dù `Exception` có xảy ra hay không hoặc khi gặp lệnh `return` trong khối `try`.
- Được khai báo sau khối lệnh `try` hoặc `catch`.
- Một khối `try` thì chỉ được 1 khối `finally`.
- Khối `finally` không được thực thi nếu có `System.exit` hoặc chương trình gặp lỗi chết.

### 4. Từ khóa throw
- Dùng để ném ra một `Exception` cụ thể.
- Thường dùng cho Exception mà người dùng tự định nghĩa.
- Sau throw là một instance.
```java
throw new ArithmeticException("Not valid");
```

### 5. Từ khóa throws
- Dùng để khai báo một `Exception`.
- Thường dùng cho `checked exception`.
- Dùng để đánh dấu một method có chứa `throw`.
- Đặt xong các params của method và kèm theo  một danh sách các exception class.

```java
public void tinh() throws FileNotFoundException 
{
    ...
}
```

## **Custom Exception**
- Extends Exception class.
- Tự custom Exception của mình.
```java
class Project2 extends Exception {
    public static void exp(int ptr) {
        if (ptr == 0)
        throw new NullPointerException();
    }
    public static void main(String[] args) {
        int i = 0;
        Project2.exp(i);
    }
}
``