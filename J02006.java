package newproject1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {
    static Set<Integer> a = new HashSet<>();
    static Set<Integer> b = new HashSet<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = 1; i <= n; i++){
            a.add(sc.nextInt());
        }
        for(int i = 1; i <= m; i++){
            b.add(sc.nextInt());
        }
        
        a.addAll(b);
        List<Integer> sortedCommonElements = new ArrayList<>(a);
        Collections.sort(sortedCommonElements);
        
        for(Integer i : sortedCommonElements){
            System.out.print(i + " ");
        }
        System.out.println();
    }   
}
