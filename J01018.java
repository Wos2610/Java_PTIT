package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static boolean check(String n){
        int sum = 0;
        for(int i = 0; i < n.length(); i++){
            sum += n.charAt(i) - '0';
            if(i > 0 && n.charAt(i) != n.charAt(i - 1) - 2 && n.charAt(i) != n.charAt(i - 1) + 2) return false;
        }
        return sum % 10 == 0;
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
