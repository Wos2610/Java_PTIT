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
        int T = 1;
        //sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String a = sc.next();
            while(true){
                int d = 0;
                for(int j = 1; j < a.length(); j++){
                    if(a.charAt(j) == a.charAt(j - 1)){
                        d = 1;
                        if(j == 1) a = a.substring(j + 1, a.length());
                        else a = a.substring(0, j - 1) + a.substring(j + 1, a.length());
                    }
                }
                if(d == 0) break;
            }
            if(a.length() == 0) System.out.println("Empty String");
            else System.out.println(a);
        }
    }
}
