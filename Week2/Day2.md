## Collections và Collection
**Collections** : 
- Là một class cung cấp các static methods (sort, search, ...) được sử dụng trong collection.
- Chứa các interface và class.
- Gồm các root interface : Collection, Map, Iterator.
- Thực chất là thư viện để dùng các hàm sử dụng trong Collection và Map

**Collection** : là một root interface trong Collections

![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20220526152255/Collections-in-Java1.png)

## **I. Methods of the Collection Interface**
```java
Collection<data_type> l = new ArrayList<data_type>();
```
  

1. boolean add(Object o)

```java
Collection<Integer> arr = new ArrayList<Integer>(6);
arr.add(20);
``` 

2. void clear()

```java
Collection<String> list = new LinkedList<String>();
list.add("Hihi");
list.clear();
```

3. boolean contains(Object o)
```java
Collection<Integer> arr = new ArrayList<Integer>(6);
arr.add(20);
boolean check = arr.contains(20);
```
4. boolean equals(Object o)

5. int size()

6. boolean remove()


## **1. List Interface**
```java
List<data_type> l1 = new ArrayList<data_type>();
List<data_type> l2 = new LinkedList<data_type>();
List<data_type> l3 = new Vector<data_type>();
List<data_type> l4 = new Stack<data_type>();
```

`ArrayList` : 
- Khác với `Array` thì `Array List` là dynamic và  có kích thước thay đổi được .
- Các phần tử được lưu trữ theo thứ tự được add() vào.  

`LinkedList` : dựa trên double-linked list (?)  
`Vector` : khá giống `Array List`. Điểm khác là `Vector` thì synchronized, `ArrayList` là non-synchronized (?)  
`Stack` : LIFO

- Object get(int index)
- Object set(int index, Objetc o)

- int indexOf(Object o) : Returns the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
- int lastIndexOf(Object o)

- Object remove(int index) : Không dùng for each

> https://gpcoder.com/4289-tranh-loi-concurrentmodificationexception-trong-java-nhu-the-nao/

- addElement(Object o)
- elementAt(int index)

- boolean contains(element) : tìm kiếm element có tồn tại không


**Phân biệt List và ArrayList**
- ArrayList chỉ dùng cho các kiểu objects  

| List | ArrayList |  
| -- | -- |  
| Interface | Class |
| List extends Collection | ArrayList extend AbstractList class and implements List interface|
| Tạo một static array | Tạo một dynamic array | 
| Không thể mở rộng kích thước | Có thể mở rộng bất kì khi nào cần |
| Không tạo được object | Tạo được object |

> Nên dùng List khi cần sử dụng tính đa hình. Khi dùng List thì có thể dễ dàng chuyển sang LinkedList mà không chịu ảnh hưởng của codebase còn lại.


## **2. Set Interface**
```java
Set<Integer> s = new HashSet();
TreeSet sortedSet = new TreeSet<Integer>(s);
```
`TreeSet` : các phần tử được sắp xếp tăng dần  
`HashSet` : các phần tử lưu dưới dạng hash table    
`EnumSet` : các phần tử là enum chứ không phải object

- remove()

## **3. Queue Interface**
`LinkedList`   
`PriorityQueue` : Các phần tử được sắp xếp  
`ArrayDeque` : Deque

- public peek() : retrieves, but ***does not remove***, the head of this queue, or returns null if this queue is empty.
- public poll() : retrieves and ***removes*** the head of this queue, or returns null if this queue is empty.
- remove(Object o)


## **4. Map Interface**
> Không kế thừa Collection Interface.   

`TreeMap` : Các key được sắp xếp sẵn, không cho chứa null  
`HashMap` :  Có thể chứa 1 key null và nhiều giá trị null.
- `LinkedHashMap` : Có thể chứa 1 key null và nhiều giá trị null.
`EnumMap` : key là enum chứ không phải object.  
`WeakHashMap` : 

- Object put(key, value);
- Object remove(key);
- Object get(key);
- boolean containsKey(key);

## **5. Sort**
| Comparable | Comparator |
| -- | -- |
| Single sort | Multiple sort |
| Affect the original class | Don't affect the original class |
| compareTo() | compare() |
| Collections.sort(List) | Collections.sort(List, Comparator) |

- Ví dụ khi sort sử dụng Comparable (nguồn : viettuts)
```java
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private String address;
 
    public Student() {
    }
 
    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
 
    // getter & setter
     
    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name 
                + ",age=" + age + ",address=" + address;
    }
 
    @Override
    public int compareTo(Student student) {
        // sort student's name by ASC
        return this.getName().compareTo(student.getName());
    }
}
```

- Ví dụ khi sort sử dụng Comparator(nguồn : viettuts)
```java
import java.util.*;

public class CollectionsExample4 {
    public static void main(String args[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        // sort list
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        // show list
        for (String element : list) {
            System.out.println(element);
        }
    }
}
```
