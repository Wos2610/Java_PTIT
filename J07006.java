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

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        List<Integer> a = new ArrayList<>();
//        a.add(10);
//        a.add(20);
//        a.add(10);
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        oos.writeObject(a);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> b = (ArrayList<Integer>) ois.readObject();
        
        Map<Integer, Integer> m = new TreeMap<>();
        for (Integer i : b) {
            m.put(i, m.containsKey(i) ? m.get(i) + 1 : 1);
        }
        for (Map.Entry<Integer, Integer> i : m.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }
        ois.close();
    }
}
