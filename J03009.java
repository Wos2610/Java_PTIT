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

    private static boolean check(String s) {
        int n = s.length();
        String s0 = new StringBuilder(s).reverse().toString();
        if (s0.equals(s) == false) {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            if(s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7' ) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            HashMap<String, Integer> m1 = new HashMap<>();
            HashMap<String, Integer> m2 = new HashMap<>();
            
            String[] splits1 = s1.split("\\s+");
            String[] splits2 = s2.split("\\s+");
            
            Arrays.sort(splits1);
            Arrays.sort(splits2);
            
            for (String j : splits1) {
                m1.put(j, m1.containsKey(j) ? m1.get(j) + 1 : 1);
            }
            
            for (String j : splits2) {
                m2.put(j, m2.containsKey(j) ? m2.get(j) + 1 : 1);
            }
            
            for (String j : splits1) {
                if(m1.get(j) != 0 && m2.containsKey(j) == false){
                    System.out.print(j + " ");
                    m1.put(j, 0);
                }
            }
            System.out.println();
        }

    }
}
