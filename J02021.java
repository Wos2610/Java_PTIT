package newproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {
    static int n = 0;
    static int k = 0;
    static int d = 0;
    static int[] a;
    static void Try(int i){
        if(i == k + 1){
            for(int j = 1; j <= k; j++){
                System.out.print(a[j]);
            }
            System.out.print(" ");
            d++;
            return;
        }
    
        for(int j = a[i - 1] + 1; j <= n - k + i; j++){
            a[i] = j;
            Try(i + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        for(int i = 1; i <= T; i++){
            n = sc.nextInt();
            k = sc.nextInt();
            a = new int[n + 6];
            Try(1);
        }
        System.out.printf("\nTong cong co %d to hop\n", d);
    }   
}
