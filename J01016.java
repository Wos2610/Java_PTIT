package newproject1;

import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            String n = sc.next();
            int d = 0;
            for(int i = 0; i < n.length(); i++){
                if(n.charAt(i) == '4' || n.charAt(i) == '7') d++;
            }
            if(d == 4 || d == 7) System.out.println("YES");
            else System.out.println("NO");
        }
        
    }   
}
