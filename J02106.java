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
            int n = sc.nextInt();
            
            int x;
            int res = 0;
            for (int j = 1; j <= n; j++) {
                int d = 0;
                for (int k = 1; k <= 3; k++) {
                    x = sc.nextInt();
                    if(x == 1) d++;
                }
                if(d >= 2) res++;
            }
            System.out.println(res);
        }
    }
}
