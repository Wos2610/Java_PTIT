package danhsachsinhvien1;

import java.io.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> a = new ArrayList<>();
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            String[] b = s.split("(?<=[.!?])\\s");
            for(String j : b){
                String tmp = j.trim().replaceAll("\\s+", " ");
                tmp = tmp.substring(0, 1).toUpperCase() + tmp.substring(1).toLowerCase();
                String x = tmp.substring(tmp.length() - 1);
                if(!".".equals(x) && !"!".equals(x) && !"?".equals(x)){
                    tmp = tmp + ".";
                }
                if(" ".equals(tmp.substring(tmp.length() - 2, tmp.length() - 1))){
                    tmp = tmp.substring(0, tmp.length() - 2) + tmp.substring(tmp.length() - 1);
                }
                a.add(tmp);
            }
        }
        for(String i : a){
            System.out.println(i);
        }
    }
}


