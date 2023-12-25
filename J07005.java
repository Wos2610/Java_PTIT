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

    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        List<Integer> a = new ArrayList<>();
//        a.add(10);
//        a.add(20);
//        a.add(10);
//        DataOutputStream oos = new DataOutputStream(new FileOutputStream("DATA.in"));
//        oos.writeInt(10);
//        oos.writeInt(20);
//        oos.writeInt(10);

        DataInputStream ois = new DataInputStream(new FileInputStream("DATA.IN"));
        Map<Integer, Integer> m = new TreeMap<>();
        for (int i = 1; i <= 100000; i++) {
            int x = ois.readInt();
            m.put(x, m.containsKey(x) ? m.get(x) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> i : m.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        ois.close();
    }
}
