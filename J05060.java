package javaapplication1;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
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

public class JavaApplication1 {

    static class Student {
        int id, age;
        String ma, name, dob, status;
        double x1, x2, x, bonus;
        long sum;

        public Student(int id, String name, String dob, double x1, double x2) {
            this.ma = String.format("PH%02d", id);
            this.name = name;
            this.dob = dob;
            this.x1 = x1;
            this.x2 = x2;
            tinh();
        }

        

        private void tinh() {
            this.age = 2021 - Integer.parseInt(this.dob.split("/")[2]);
            this.x = (this.x1 + this.x2) / 2;

            if(this.x1 >= 8 && this.x2 >= 8) this.bonus = 1;
            else if(this.x1 >= 7.5 && this.x2 >= 7.5) this.bonus = 0.5;
            
            this.sum = Math.round(this.x + this.bonus);
            if(this.sum > 10) this.sum = 10;
            
            if(this.sum < 5) this.status = "Truot";
            else if(this.sum <= 6) this.status = "Trung binh";
            else if(this.sum <= 7) this.status = "Kha";
            else if(this.sum <= 8) this.status = "Gioi";
            else this.status = "Xuat sac";
        }

        @Override
        public String toString() {
            return ma + " " + name + " " +  age + " " + sum + " " + status;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(Double.compare(o2.sum, o1.sum) == 0){
//                    return o1.ma.compareTo(o2.ma);
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
