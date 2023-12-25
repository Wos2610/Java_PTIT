package newproject1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {
    private static List<Integer> a;
    
    private static void sort(int n){
        int k = 1;
        
        for(int i = 1; i < n; i++){
            int mark = 0;
            
            for(int j = 0; j < n - 1; j++){
                if(a.get(j) > a.get(j + 1)){
                    Collections.swap(a, j, j + 1);
                    mark = 1;
                }
            }
            if(mark == 1){
                System.out.printf("Buoc %d: ", k);
                for(int j : a){
                    System.out.print(j + " ");
                }
                System.out.println();
                k++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
//        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            a = new ArrayList<>(n + 6);
            for(int j = 1; j <= n; j++){
                a.add(sc.nextInt());
            }
            sort(n);
        }
    }
}
