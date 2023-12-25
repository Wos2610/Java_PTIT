import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Test24 {
    int m = 0;
    static public void tinh(String s){
        int n = s.length();
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2);
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger c = a.add(b);
        String res = c.toString();
        System.out.println(res);
        if(res.length() == 1){
            return;
        }
        else{
            tinh(res);
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String res = n;
        tinh(n);
    }
}
