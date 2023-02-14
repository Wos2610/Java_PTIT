
# MVC Pattern :
![](https://niithanoi.edu.vn/pic/News/images/tin-tuc-cong-nghe-va-lap-trinh/mo-hinh-mvc.jpg)

MVC : Model - View - Controller
- Model : Là một object bao gồm các dữ liệu và các logic để update controller khi dữ liệu cần thay đổi.
- View : Hiển thị những dữ liệu mà model có.
- Controller : Điều khiển data trong model và update view khi data thay đổi.


# Vào ra File

## **1. Byte Stream**
- Sử dụng cho các input, output của các byte (8 bit).

```java
package project2;

import java.util.*;
import java.io.*;

public class Project2 {
    
    public static void main(String[] args) throws IOException{
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("input.txt");
            output = new FileOutputStream("output.txt");
            int c;
            while((c = input.read()) != -1){
                output.write(c);
            }
        }
        finally{
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
    
    
}
```

> input.read() : trả về -1 nếu đến cuối file

## Sử dụng Buffered Stream Wrapper cho Byte Stream


``` java
package project2;

import java.util.*;
import java.io.*;

public class Project2 {
    
    public static void main(String[] args) throws IOException{
        BufferedInputStream input = null;
        BufferedOutputStream output = null;
        try{
            input = new BufferedInputStream(new FileInputStream ("input.txt"));
            output = new BufferedOutputStream(new FileOutputStream("output.txt"));
            int c;
            while((c = input.read()) != -1){
                output.write(c);
            }
        }
        finally{
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
    
    
}
```

## **2. Character Stream**
- Sử dụng cho input và output Unicode 16 bit

```
package project2;

import java.util.*;
import java.io.*;

public class Project2 {
    
    public static void main(String[] args) throws IOException{
        FileReader input = null;
        FileWriter output = null;
        
        try{
            input = new FileReader("input.txt");
            output = new FileWriter("output.txt");
            int c;
            while((c = input.read()) != -1){
                output.write(c);
            }
        }
        finally{
            if(input != null){
                input.close();
            }
            if(output != null){
                output.close();
            }
        }
    }
    
    
}
```

## **3. Sử dụng Scanning và Formatting**

```java
package project2;

import java.util.*;
import java.io.*;

public class Project2 {
    
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(new File ("input.txt"));
        while(input.hasNext()){
            int s = Integer.parseInt(input.next());
            System.out.format("%06d%n", s);
        }
        input.close();
    }
    
    
}
```



