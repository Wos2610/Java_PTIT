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
    private static String res = "";
    private static boolean check(String s){
        int n = s.length();
        int d = 0;
        for(int i = 0; i < n; i++){
           switch (s.charAt(i)) {
    case '0':
    case '8':
    case '9':
        res += "0";
        break;
    case '1':
        res += "1";
        d = 1;
        break;
    default:
        return false;
}

        }
        res = res.replaceFirst("^0+(?!$)", "");
        if(d == 0) return false;
        return true;
    }
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String s = sc.nextLine();
            res = "";
            if(check(s) == true) System.out.println(res);
            else System.out.println("INVALID");
        }
    }
}