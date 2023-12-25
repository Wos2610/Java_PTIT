package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static boolean check(int a){
        if((int)Math.sqrt(a) * (int)Math.sqrt(a) == a) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            int n = sc.nextInt();
            if(check(n) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
