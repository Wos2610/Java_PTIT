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
    private static void change(String s){
        s = s.replaceAll("\\s+", " ").trim();
        String[] s0 = s.split("\\s+");
        int n = s0.length;
        for(int i = 0; i < n; i++){
            String tmp = new StringBuilder(s0[i]).reverse().toString();
            s0[i] = tmp;
        }
        
        for(String i : s0){
            System.out.print(i + " ");
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String s = sc.nextLine();
            change(s);
            System.out.println();
        }
    }
}
