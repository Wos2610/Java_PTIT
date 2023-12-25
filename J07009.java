package javaapplication1;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JavaApplication1 {

    static class IntSet {

        int[] a;

        public IntSet() {
        }

        public IntSet(int[] a) {
            this.a = a;
        }

        public IntSet intersection(IntSet b) {
            Set<Integer> res = new TreeSet<>();
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.a.length; j++) {
                    if (b.a[j] == a[i]) {
                        res.add(a[i]);
                    }
                }
            }
            IntSet x = new IntSet();
            x.a = new int[res.size()];
            int index = 0;
            for (Integer value : res) {
                x.a[index++] = value;  // Corrected array assignment
            }
            return x;
        }

        @Override
        public String toString() {
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += a[i] + " ";
            }
            return res;
        }
        
        
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }
    public static void main7320628(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.intersection(s2);
        System.out.println(s3);
    }

//    public static void main7320628(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        List<Product> list = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            list.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextLine()));
//        }
//
////        Collections.sort(list2, new Comparator<Match>() {
////            @Override
////            public int compare(Match o1, Match o2) {
////                if(Double.compare(o2.sum, o1.sum) == 0){
////                    return o1.clb.name.compareTo(o2.clb.name);
////                }
////                return Double.compare(o2.sum, o1.sum);
////            }
////
////        });
//        int m = Integer.parseInt(sc.nextLine());
//        List<Nhap> list2 = new ArrayList<>();
//        for(int i = 1; i <= m; i++){
//            String ma = sc.next();
//            for(Product j : list){
//                if(j.ma.equals(ma)){
//                    list2.add(new Nhap(j, Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next())));
//                }
//            }
//        }
//        for (Nhap i : list2) {
//            System.out.println(i);
//        }
//
//    }
}

