package danhsachsinhvien1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {
    private static boolean checkEvenNumber(String s){
        int n = s.length();
        if(n % 2 != 0) return false;
        int e = 0;
        int o = 0;
        for(int i = 0; i < n; i++){
            if((s.charAt(i) - '0') % 2 == 0) e++;
            else o++;
        }
        if(e <= o) return false;
        return true;
    }
    
    private static boolean checkOddNumber(String s){
        int n = s.length();
        if(n % 2 == 0) return false;
        int e = 0;
        int o = 0;
        for(int i = 0; i < n; i++){
            if((s.charAt(i) - '0') % 2 == 0) e++;
            else o++;
        }
        if(o <= e) return false;
        return true;
    }
    
    static boolean check(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9') return false;
        }
        return true;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String s = sc.nextLine();
            if(s.charAt(0) == '0' || check(s) == false){
                System.out.println("INVALID");
                continue;
            }
            if(checkEvenNumber(s) == true || checkOddNumber(s) == true) System.out.println("YES");      
            else System.out.println("NO");
            
        }

    }
}

