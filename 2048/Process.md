1.
- Phải `setSize()` của JFrame trước khi `setLocationRelativeTo(null)` -> frame sẽ chính giữa màn hình.
- Mỗi khi muốn truy cập đến instance của Controller thì phải getInstance.
2.
- Singleton is used to ensure that a class has only one instance created throughout the application.
3.
- `addKeyListener(KeyListener l)` khi dùng cho JPanel phải có thêm `requestFocus()`

Bug
- Khi không hợp được 2 ô thì ko được sinh thêm ô mới.
- Sinh ô mới phải không được quá sát ô hợp vào.


- Nên thêm animation cho sum rồi mới addNew


Need:
- Lưu lại bàn đang chơi dở.
- Cập nhật Highest score.
- Thêm chuyển động cho các block.
- Có thể thêm thời gian đếm ngược.

Graphics
- Hàm `setRenderingHint(RenderingHints.Key hintKey, Object hintValue)` :  thiết lập các thuộc tính như chất lượng vẽ, hiệu ứng bóng đổ, sự mờ hoặc độ sáng của hình ảnh, tốc độ xử lý và các thuộc tính khác liên quan đến việc tối ưu hóa vẽ đồ họa.

23/03/2023
- JPanel khi `setOpaque(false)` mới hiển thị.

- TimingFramework

Đối tượng Animator: TimingFramework sử dụng đối tượng Animator để quản lý các animation. Đối tượng này có thể được cấu hình để chạy animation trong một khoảng thời gian nhất định và với các tham số điều khiển khác.

Interpolator: TimingFramework cung cấp một số lượng lớn các Interpolator khác nhau để tạo các đường cong chuyển động khác nhau. Interpolator sử dụng để kiểm soát tốc độ của animation trong quá trình thực hiện.

TimingSource: Đây là thành phần trung tâm của TimingFramework. TimingSource xác định thời gian giữa các khung hình trong animation. TimingSource có thể được cấu hình để sử dụng các nguồn thời gian khác nhau như các sự kiện hệ thống, hoặc bộ đếm thời gian chính xác.

TimingTarget: Đây là một đối tượng mà Animator được cấu hình để thay đổi các thuộc tính của nó trong quá trình thực hiện animation. TimingTarget thường được sử dụng để thay đổi các thuộc tính trên các thành phần giao diện người dùng, chẳng hạn như độ trong suốt, kích thước, vị trí và màu sắc.

PropertySetter: Lớp này được sử dụng để thiết lập các giá trị thuộc tính của các đối tượng trong quá trình thực hiện animation. PropertySetter có thể được sử dụng để thay đổi các thuộc tính của bất kỳ đối tượng nào, không chỉ các thành phần giao diện người dùng.

SplineInterpolator: Đây là một loại Interpolator đặc biệt, được sử dụng để tạo ra các đường cong chuyển động mượt mà và tự nhiên hơn. SplineInterpolator cung cấp các tham số điều khiển để tùy chỉnh đường cong chuyển động theo cách mà người dùng mong muốn.

AnimatorBuilder: Đối tượng AnimatorBuilder được sử dụng để cấu hình các thông số cho đối tượng Animator


- Animator animator = new Animator.Builder(). Beacuse Animator class, which is an abstract class and cannot be instantiated directly. Instead, you need to use the Animator.Builder to create an instance of the Animator class.

- Khởi tạo một SwingTimerTimingSource để cung cấp thời gian và một thời gian chạy của Animator.
```java
  TimingSource timingSource = new SwingTimerTimingSource();
```

```java
  Animator animator = new Animator.Builder(timingSource)
          .setDuration(durationMs, TimeUnit.MILLISECONDS)
          .setInterpolator(new SplineInterpolator(0.4, 0.0, 0.2, 1.0))
          .addTarget(PropertySetter.getTarget(panel, "size", new Dimension(0, 0), new Dimension(200, 200)))
          .build();
```

SplineInterpolator được sử dụng để tạo ra một đường cong trơn tru hơn và tự nhiên hơn trong quá trình thay đổi kích thước của JPanel.

setSize()/setPreferredSize()
- setSize() -- use when a parent layout manager does not exist; the places this will typically have an effect would be on top-level components (`JFrames` and `JWindows`) and things that are inside of `scrolled panes`. 
- setPreferredSize() (also its related setMinimumSize and setMaximumSize) -- use when a parent layout manager exists.

GridLayout không quan tâm đến maximumSize và minimumSize của JComponent thành phần. Khi sử dụng GridLayout, kích thước của mỗi thành phần bằng nhau và phụ thuộc vào kích thước của ô lưới. Vì vậy, để đặt kích thước cho một thành phần trong GridLayout, bạn có thể đặt kích thước cho ô lưới bằng cách sử dụng phương thức setPreferredSize() hoặc setSize() cho thành phần đó. Với kích thước của ô lưới được đặt, kích thước của mỗi thành phần sẽ tự động được tính toán theo tỷ lệ tương ứng, với các thành phần có cùng kích thước. 

JFrame : undecorate == true để không hiển thị thanh tiêu đề

Khi muốn chỉnh size của Label cần quan tâm :
preferredSize + Horizontal Size , Vertical Size + Text
```
public void writeTimerToFile(){
        try {
            FileOutputStream outputStream = new FileOutputStream("Time.txt");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-16");
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
             
            bufferedWriter.write(Integer.toString(level));
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(minOfTimer));
            bufferedWriter.newLine();
            bufferedWriter.write(Integer.toString(secOfTimer));
            
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
```

-> Exception in thread "AWT-EventQueue-0" java.lang.NumberFormatException: For input string: "??1"
- Đã ghi số 1 vào file nhưng đọc bị lỗi ??1 là do sử dụng UTF-16
-> Solution: chuyển thành UTF-8

Cách tối ưu để code không bị lag
- Sử dụng ResourceManager để quản lí các file load từ bộ nhớ.
- Ban đầu trong GamePlay() khi renderBoard sử dụng switch-case để setColor cho các PanelRound nhưng làm cho game bị giật lag rất nặng 
-> Lưu các color vào mảng 2 chiều `int[] colors` 