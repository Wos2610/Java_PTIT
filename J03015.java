package newproject1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {
    private static String loaiBo0(String s){
        while(s.length() > 1 && s.charAt(0) == '0'){
            s = s.substring(1);
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
//        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            a = a.subtract(b);
            String s = a.toString();
            if(s.equals("-0")){
                System.out.println("0");
            }
            else{
                if(s.charAt(0) == '-'){
                    System.out.print("-");
                    s = s.substring(1);
                }
                s = loaiBo0(s);
                System.out.println(s);
            }
            
        }
    }
}
