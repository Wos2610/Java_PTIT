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
        int T = 1;
        for(int i = 1; i <= T; i++){
            int n = sc.nextInt();
            int[] a = new int[n + 6];
            for(int j = 1; j <= n; j++){
                a[j] = sc.nextInt();
            }
         
            for(int j = 1; j < n; j++){
                System.out.printf("Buoc %d: ", j);
                int ind = j;
                for(int k = j + 1; k <= n; k++){
                    if(a[k] < a[ind]){
                        ind = k;
                    }
                }
                
                int temp = a[ind];
                a[ind] = a[j];
                a[j] = temp;
                
                for(int k = 1; k <= n; k++){
                    System.out.print(a[k] + " ");
                }
                System.out.println();
            }
        }
    }   
}
