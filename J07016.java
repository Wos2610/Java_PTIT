package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NewProject1 {

    static boolean check(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    static Map<Integer, Integer> input(String file) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        List<Integer> a = (ArrayList<Integer>) ois.readObject();
        ois.close();

        Collections.sort(a);
        
        Map<Integer, Integer> b = new TreeMap<>();
        for (Integer i : a) {
            if (check(i) == true) {
                if (b.containsKey(i)) {
                    b.put(i, b.get(i) + 1);
                } else {
                    b.put(i, 1);
                }
            }
        }
        return b;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA1.in"));
//        List<Integer> list = new ArrayList<>();
//        for(int i = 1; i <= 20; i++){
//            list.add(i);
//        }
//        oos.writeObject(list);
//        oos.close();
//        
//        oos = new ObjectOutputStream(new FileOutputStream("DATA2.in"));
//        List<Integer> list2 = new ArrayList<>();
//        for(int i = 13; i <= 20; i++){
//            list2.add(i);
//        }
//        oos.writeObject(list2);
//        oos.close();

        Map<Integer, Integer> x1 = input("DATA1.in");
        Map<Integer, Integer> x2 = input("DATA2.in");

        for (Map.Entry<Integer, Integer> entry : x1.entrySet()) {
            if(x2.containsKey(entry.getKey())){
                System.out.println(entry.getKey() + " " + entry.getValue() + " " + x2.get(entry.getKey()));
            }
        }

    }
}
