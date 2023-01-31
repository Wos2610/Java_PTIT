package day1;

import java.util.*;

public class Day1 {
    
    public static boolean isAllEven(String s){
        int n = s.length();
        String x = "";
        for(int i = 0; i < n; i++){
            if( (int)s.charAt(i) % 2 != 0 ){
                return false;
            }
            x = s.charAt(i) + x;
        }
        if(x.compareTo(s) == 0){
            return true;
        }
        return false;
    }
    
    public static boolean isDieuKien(String s){
        int n = s.length();
        if(s.charAt(0) != '8'){
            return false;
        }
        if(s.charAt(n - 1) != '8'){
            return false;
        }
        
        String x = "";
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += s.charAt(i) - '0';
            x = s.charAt(i) + x;
        }
        if(sum % 10 == 0 && x.compareTo(s) == 0){
            return true;
        }
        return false;
    }
    
    static public boolean isNgTo(String s){
        int n = s.length();
        String x = "";
        for(int i = 0; i < n; i++){
            int temp = s.charAt(i) - '0';
            if(temp != 2 && temp != 3 && temp != 5 && temp != 7){
                return false;
            }
            x = s.charAt(i) + x;       
        }
        if(x.compareTo(s) == 0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(isAllEven(s));
        System.out.println(isDieuKien(s));
        System.out.println(isNgTo(s)); 
    }
    
}
