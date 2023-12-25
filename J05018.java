package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    static class Student{
        String ma, name, xepLoai;
        double[] a = new double[10];
        double tb;

        public Student(int id, String name, double[] a) {
            this.ma = String.format("HS%02d", id);
            this.name = name;
            
            for(int i = 0; i < 10; i++){
                if(i == 0 || i == 1){
                    this.tb += a[i] * 2;
                }
                else{
                    this.tb += a[i];
                }
            }
            this.tb /= 12;
            if(this.tb >= 9.0){
                this.xepLoai = "XUAT SAC";
            }
            else if(this.tb >= 8.0){
                this.xepLoai = "GIOI";
            }
            else if(this.tb >= 7.0){
                this.xepLoai = "KHA";
            }
            else if(this.tb >= 5.0){
                this.xepLoai = "TB";
            }
            else{
                this.xepLoai = "YEU";
            }
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + Math.round(tb * 10.0) / 10.0 + " " + xepLoai;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for(int j = 1; j <= t; j++){
            String name = sc.nextLine();
            double[] x = new double[10];
            for(int i = 0; i < 10; i++){
                x[i] = sc.nextDouble();
            }
            sc.nextLine();
            list.add(new Student(j, name, x));
        }
 
        Collections.sort(list, (Student o1, Student o2) -> {
            if(Double.compare(o1.tb, o2.tb) == 0){
                return o1.ma.compareTo(o2.ma);
            }
            return Double.compare(o2.tb, o1.tb);
        });
        for(Student i : list){
            System.out.println(i);
        }
    }
}
