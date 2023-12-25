package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    static String chuanHoa(String s){
        s = s.trim().replaceAll("\\s+"," ");
        String[] a = s.split("\\s+");
        String res = "";
        for(int i = 1; i < a.length; i++){
            res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1){
                res += " ";
            }
        }
        res += ", ";
        res += a[0].toUpperCase();
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }

}



