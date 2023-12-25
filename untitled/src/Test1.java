import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    static boolean check(String s){
        int n = s.length();
        if(n % 2 == 0) return false;
        for(int i = 0; i <= n/2; i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') return false;
            if(s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; i++){
            String s = sc.nextLine();
            s = s.toLowerCase();
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

