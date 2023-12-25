package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(sc.nextInt());
        }
        
        Collections.sort(a);
        int mark = 0;
        for(int i = 1; i <= a.get(n - 1); i++){
            if(a.contains(i) == false){
                mark = 1;
                System.out.println(i);
            }
        }
        if (mark == 0){
            System.out.println("Excellent!");
        }
    }

}


