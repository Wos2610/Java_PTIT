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
import java.util.*;

public class NewProject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String s = sc.next();
            int n = s.length();
            int d = 0;
            for(int j = 0; j < n/2; j++){
                if(s.charAt(j) != s.charAt(n - j - 1)) d++;
            }
            
            if(d > 1) System.out.println("NO");
            else if(d == 1) System.out.println("YES");
            else{
                if(n % 2 == 0) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
