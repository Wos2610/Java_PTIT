package day1_bai2;

import java.util.*;

public class Day1_Bai2 {
    
    public static String chuanHoa1(String s){
        String[] save = s.trim().toLowerCase().split("\\s+");
        String res = "";
        for(String i : save){
            res += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return res.trim();
    }
    
    public static String chuanHoa2(String s){
        String[] save = s.trim().toLowerCase().split("\\s+");
        String res = "";
        
        for(int i = 1; i < save.length; i++){
            res += save[i].substring(0, 1).toUpperCase() + save[i].substring(1) + " ";
        }
        res = res.trim();
        res += ", " + save[0].toUpperCase();
        return res;
    }
    
    public static String chuanHoa3(String s){
        String[] save = s.trim().toLowerCase().split("\\s+");
        String res = "";
        
        for(int i = 0; i < save.length - 1; i++){
            res += save[i].charAt(0);
        }
        
        res = save[save.length - 1] + res + "@ptit.edu.vn";
        
        return res;
    }
    
    public static String chuanHoaDoan(String s){
        String[] save = s.trim().split("\\s+");
        String res = "";
        
        for(int i = 0; i < save.length - 1; i++){
            res += save[i].charAt(0);
        }
        
        res = save[save.length - 1] + res + "@ptit.edu.vn";
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(chuanHoa1(s));
        System.out.println(chuanHoa2(s));
        System.out.println(chuanHoa3(s));
    }
    
}
