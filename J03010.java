package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    static String chuanHoa(String s){
        s = s.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] a = s.split("\\s+");
        String res = "";
        res += a[a.length - 1].toLowerCase();
        for(int i = 0; i < a.length - 1; i++){
            res += a[i].substring(0, 1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> a = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String s = chuanHoa(sc.nextLine());
            a.put(s, a.containsKey(s) ? a.get(s) + 1 : 1);
            if(a.get(s) != 1){
                s += a.get(s);
            }
            s += "@ptit.edu.vn";
            System.out.println(s);
        }
    }

}



