package newproject1;

import java.util.ArrayList;
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
       if(s0.equals(s) == false) return false;
       for(int i = 0; i < n; i++){
           if((s.charAt(i) - '0') % 2 == 1) return false;
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
