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
    private static List<String> s0 = new ArrayList<>();
    private static void start(){
        for(int i = 2; i <= 9; i++){
            if(i == 7 || i == 9){
                String tmp = "";
                tmp += i;
                for(int j = 1; j <= 4; j++){
                    s0.add(tmp);
                }
            }
            else{
                String tmp = "";
                tmp += i;
                for(int j = 1; j <= 3; j++){
                    s0.add(tmp);
                }
            }
        }
    }
    
    private static void change(String s){
        int n = s.length();
        s = s.toUpperCase();
        String res = "";
        for(int i = 0; i < n; i++){
            res += (s0.get(s.charAt(i) - 'A'));
        }
        String reversed_res = new StringBuilder(res).reverse().toString();
        if(res.equals(reversed_res)) System.out.println("YES");
        else System.out.println("NO");
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        start();
        for (int i = 1; i <= T; i++) {
            String s = sc.nextLine();
            change(s);        
        }

    }
}
