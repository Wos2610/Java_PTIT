package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            String s = sc.next();
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
