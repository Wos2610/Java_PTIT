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
            String a = sc.next();
            String b = sc.next();
            if(a.equals(b)) System.out.println("-1");
            else{
                System.out.println(Math.max(a.length(), b.length()));
            }
        }
    }
}
