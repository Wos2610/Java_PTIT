package newproject1;

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
    private static int[] a;
    
    private static boolean check(int n){
        for(int i = 2; i <= n; i++){
            if(Math.abs(a[i] - a[i - 1]) == 1) return false;
        }
        return true;
    }
    
    private static void Try(int i, int n, int[] m){
        if(i == n + 1){
            if(check(n) == true){
                for(int j = 1; j <= n; j++){
                    System.out.print(a[j]);
                }
                System.out.println();
            }
            return;
        }
        
        for(int j = 1; j <= n; j++){
            if(m[j] == 0){
                a[i] = j;
                m[j] = 1;
                Try(i + 1, n, m);
                m[j] = 0;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            a = new int[n + 6];
            int[] m = new int[n + 6];
            Try(1, n, m);
        }
    }
}
