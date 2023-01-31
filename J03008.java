import java.util.*;

public class J03008 {
    static public void main(String[] args){
        Scanner input = new Scanner (System.in);
        int T = input.nextInt();

        while(T-- > 0){
            String n = input.next();
            if(isThuanNghich(n) == true && isNgTo(n) == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

    static public boolean isThuanNghich(String s){
        int n = s.length();
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) != s.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }

    static public boolean isNgTo(String s){
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7'){
                return false;
            }
        }
        return true;
    }
}