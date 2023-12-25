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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        
        for (int i = 1; i <= T; i++) {
            String s = sc.nextLine();
            HashMap<Character, Integer> m = new HashMap<>();
            
            int n = s.length();
            for(int j = 0; j < n; j++){
                char c = s.charAt(j);
                m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
            }
            System.out.println(m.size());
        }
    }
}
