package danhsachsinhvien1;

import java.io.*;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NewProject1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        Map<Integer, Integer> m = new TreeMap<>();
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            if(x == -1) break;
            m.put(x, m.containsKey(x) ? m.get(x) + 1 : 1);
        }
        for(Map.Entry<Integer, Integer> i : m.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
    }
}


