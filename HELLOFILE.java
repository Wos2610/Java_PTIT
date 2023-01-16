import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args){
        Scanner input = new Scanner(new File("Hello.txt"));
        String s = input.nextLine();
        System.out.println(s);
    }
}