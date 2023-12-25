package newproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 1; i <= T; i++){
            System.out.printf("Test %d:\n", i);
            int n = sc.nextInt();
            int x = 0;
            HashMap<Integer, Integer> m = new HashMap<>();
            int[] a = new int[n + 6];
            for(int j = 0; j < n; j++){
                a[j] = sc.nextInt();
                m.put(a[j], m.containsKey(a[j]) ? m.get(a[j]) + 1 : 1);
            }
         
            for(int j = 0; j < n; j++){
                if(m.get(a[j]) != 0) {
                    System.out.printf("%d xuat hien %d lan\n", a[j], m.get(a[j]));
                    m.put(a[j], 0);
                }
            }
        }
    }   
}
