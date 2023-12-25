package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[] a = new int[n + 6];
            int l = 0;
            int r = 0;
            for(int j = 1; j <= n; j++){
                a[j] = sc.nextInt();
                r += a[j];
            }
            
            int mark = 0;
            for(int j = 1; j <= n; j++){
                l += a[j - 1];
                r -= a[j];
                if(l == r){
                    System.out.println(j);
                    mark = 1;
                    break;
                }
            }
            if(mark == 0){
                System.out.println("-1");
            }
        }
    }

}


