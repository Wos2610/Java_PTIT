package danhsachsinhvien1;

import java.io.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
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

    static class Tu {

        String a;
        int n;

        public Tu(String a, int n) {
            this.a = a;
            this.n = n;
        }

        @Override
        public String toString() {
            return a + " " + n;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Tu> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            {
                String[] b = sc.nextLine().trim().toLowerCase().split("[^a-z0-9]");
                for (String j : b) {
                    if (!"".equals(j)) {
                        int mark = 0;
                        for (Tu k : a) {
                            if (k.a.equals(j)) {
                                mark = 1;
                                k.n++;
                            }
                        }
                        if (mark == 0) {
                            a.add(new Tu(j, 1));
                        }
                    }

                }
            }
        }
        Collections.sort(a, new Comparator<Tu>() {
            @Override
            public int compare(Tu o1, Tu o2) {
                if (o1.n == o2.n) {
                    return o1.a.compareTo(o2.a);
                }
                return o2.n - o1.n;
            }

        });

        for (Tu i : a) {
            System.out.println(i);
        }
    }
}
