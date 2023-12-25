package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static boolean check(String n){
        for(int i = 1; i < n.length(); i++){
            if(n.charAt(i) != n.charAt(i - 1) - 1 && n.charAt(i) != n.charAt(i - 1) + 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            String n = sc.next();
            if(check(n) == true) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }   
}
