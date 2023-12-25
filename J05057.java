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

    static class Student{
        String ma, name, status;
        double x1, x2, x3, x, bonus, sum;

        public Student(String ma, String name, double x1, double x2, double x3) {
            this.ma = ma;
            this.name = name;
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            tinh();
        }
        
        private void tinh(){
            this.x = this.x1 * 2 + this.x2 + this.x3;
            
            String tmp = ma.substring(0, 3);
            switch (tmp) {
                case "KV1":
                    this.bonus = 0.5;
                    break;
                case "KV2":
                    this.bonus = 1.0;
                    break;
                case "KV3":
                    this.bonus = 2.5;
                    break;
                default:
                    break;
            }
            
            this.sum = this.x + this.bonus;
            if(this.sum >= 24) this.status = "TRUNG TUYEN";
            else this.status = "TRUOT";
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + NumberFormat.getInstance().format(bonus) + " " + NumberFormat.getInstance().format(x) + " " + status;
        }
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        
        for (Student i : list) {
            System.out.println(i);
        }

    }

}
