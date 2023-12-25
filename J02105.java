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
            for (int j = 1; j <= n; j++) {
                System.out.printf("List(%d) = ", j);
                for (int k = 1; k <= n; k++) {
                    x = sc.nextInt();
                    if(x == 1) System.out.printf("%d ",k);
                }
                System.out.println();
            }
        }
    }
}
