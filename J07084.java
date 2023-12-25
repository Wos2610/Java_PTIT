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
    static class Student{
        String ten;
        LocalDateTime start, end;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        long time = 0;

        public Student(String ten, String start, String end) {
            this.ten = ten;
            this.start = LocalDateTime.parse(start, f);
            this.end = LocalDateTime.parse(end, f);
            tinh();
        }
        
        public void tinh(){
            time = ChronoUnit.MINUTES.between(start, end);
        }

        @Override
        public String toString() {
            return ten + " " + time;
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        List<Student> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(a, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                if(Long.compare(o2.time, o1.time) == 0) return o1.ten.compareTo(o2.ten);
                return Long.compare(o2.time, o1.time);
            }
        });
        
        for(Student i : a){
            System.out.println(i);
        }
        
    }
}
