package newproject1;

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
    private static boolean check(String s){
        int n = s.length();
        String s0 = s.substring(n - 6, n);
        
        if(s0.charAt(0) == s0.charAt(1) && s0.charAt(1) == s0.charAt(2) && s0.charAt(2) == s0.charAt(4) &&  s0.charAt(4) == s0.charAt(5)) return true;
        if(s0.charAt(0) == s0.charAt(1) && s0.charAt(1) == s0.charAt(2) &&  s0.charAt(4) == s0.charAt(5)) return true;
        if(s0.charAt(0) < s0.charAt(1) && s0.charAt(1) < s0.charAt(2) && s0.charAt(2) < s0.charAt(4) && s0.charAt(4) < s0.charAt(5)) return true;
        
        for(int i = 0; i < 6; i++){
            if(i != 3 && s0.charAt(i) != '6' && s0.charAt(i) != '8') return false;
        }
        return true;
    }
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String s = sc.nextLine();
            if(check(s) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
