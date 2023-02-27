# Java Swing
- Component : Everything you see on the display in a Java application is a component. This includes things like windows, panels, buttons, checkboxes, scrollbars, lists, menus, and text fields. To be used, a component usually must be placed in a container.
![](https://static.javatpoint.com/images/swinghierarchy.jpg)

- Container cung cấp một không gian để đặt các Component

- FlowLayout(): arrange the Components in a line.
## 1. JFrame
![](https://www3.ntu.edu.sg/home/ehchua/programming/java/images/AWT_ContainerComponent.png)

- Syntax:
```java
public class JFrame extends Frame implements WindowConstants, Accessible, RootPaneContainer
```
- Khởi tạo mặc định là invisible.
- Khi khởi tạo JFrame(String title) thì sẽ có title.
- Để visible thì gọi đến setVisible(true).

## 2. JTextField
![](https://media.geeksforgeeks.org/wp-content/uploads/151.png)

- Allows the editing of a single line text.
- Syntax:
```java
public class JTextField extends JTextComponent implements SwingConstants  
```
- Dùng setEditable(false) để không cho edit text.
- addActionListener(ActionListener a) : Thêm action listener để nhận action events từ this text.

## JPasswordField
- a special type of text field that allows you to hide or change the character being displayed to the user.

## 3. JButton
- Gồm 1 label và tạo 1 event khi được click.
- Có thể chèn image vào.
- Syntax:
```java
public class JButton extends AbstractButton implements Accessible  
```
- addActionListener(ActionListener a) : Thêm action listener tới đối tượng này.
- setEnable(boolean) : enable/disable this button.
- set/getActionCommand() : set/display a message in the console on the click of the button.
## 4. JPanel
![](https://static.javatpoint.com/java/swing/images/java-jpanel1.png)

- Syntax:
```java
public class JPanel extends JComponent implements Accessible
```
- Khi khởi tạo JPanel() thì tạo JPanel double buffer và FlowLayout.

## 5. JMenu
![](https://static.javatpoint.com/java/swing/images/java-jmenuitem-and-jmenu1.png)

- Syntax:
```java
public class JMenu extends JMenuItem implements MenuElement, Accessible  
```
- Ex: Menu

## JMenuBar
- Is used to display menubar on the window or frame. It may have several menus.
- Syntax:
```java
public class JMenuBar extends JComponent implements MenuElement, Accessible  
```
## JMenuItem
```java
public class JMenuItem extends AbstractButton implements Accessible, MenuElement  
```
- Ex: Item1, Item2, Item3

## 6. JLabel
![](https://static.javatpoint.com/java/swing/images/java-jlabel1.png)

- Có thể hiển thị text/image.
- Mặc định : các label được căn chỉnh theo chiều dọc, text-only căn chỉnh theo cạnh, image-only căn chỉnh theo chiều ngang.
- Syntax:
```java
public class JLabel extends JComponent implements SwingConstants, Accessible  
```
## 7. JComboBox
![](https://static.javatpoint.com/java/swing/images/java-jcombobox1.png)

- Bao gồm : 1 button + 1 trường có thể thay đổi + 1 drop-down list.
- Syntax:
```java
public class JComboBox extends JComponent implements ItemSelectable, ListDataListener, ActionListener, Accessible
```

## 8. ActionEvent
- Syntax:
```java
public class ActionEvent extends AWTEvent
```
- The ActionEvent is generated when button is clicked or the item of a list is double clicked.


