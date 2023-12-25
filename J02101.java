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
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            int[][] a = new int[n + 6][n + 6];
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    a[j][k] = sc.nextInt();
                }
            }
            
            for(int j = 1; j <= n; j++){
                if(j % 2 != 0){
                    for(int k = 1; k <= n; k++){
                        System.out.print(a[j][k] + " ");
                    }
                }
                else{
                    for(int k = n; k >= 1; k--){
                        System.out.print(a[j][k] + " ");
                    }
                }
            }
            System.out.println("");
        }
    }

}


