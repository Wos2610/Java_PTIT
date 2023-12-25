package newproject1;

import java.io.File;
import java.io.FileNotFoundException;
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

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger x = sc.nextBigInteger();
        while(true){
            String s = x.toString();
            int n = s.length();
            if(n == 1) break;
            String s1 = s.substring(0, n/2);
            String s2 = s.substring(n/2);
            
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            x = n1.add(n2);
            System.out.println(x);
        }
        
    }
}
