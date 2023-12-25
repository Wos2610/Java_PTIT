package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
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

    static class Student {

        int id;
        String ma, ten, lop, dob;
        double gpa;

        public Student(int id, String ten, String lop, String dob, double gpa) {
            this.id = id;
            this.ma = String.format("B20DCCN%03d", id);
            this.ten = chuanHoaTen(ten);
            this.lop = lop;
            this.dob = chuanHoaNgay(dob);
            this.gpa = gpa;
        }

        private String chuanHoaTen(String s) {
            String[] arr = s.trim().split("\\s+");
            String res = "";
            for (int i = 0; i < arr.length; i++) {
                res += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
                if (i != arr.length - 1) {
                    res += " ";
                }
            }
            return res;
        }

        private String chuanHoaNgay(String s) {
            String[] arr = s.split("/");
            String res = "";
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() < 2) {
                    res += "0";
                }
                res += arr[i];
                if (i != arr.length - 1) {
                    res += "/";
                }
            }
            return res;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + dob + " " + String.format("%.2f", gpa);

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }

//        Collections.sort(list2, new Comparator<Match>() {
//            @Override
//            public int compare(Match o1, Match o2) {
//                if(Double.compare(o2.sum, o1.sum) == 0){
//                    return o1.clb.name.compareTo(o2.clb.name);
//                }
//                return Double.compare(o2.sum, o1.sum);
//            }
//
//        });
        for (Student i : list) {
            System.out.println(i);
        }
    }

}
