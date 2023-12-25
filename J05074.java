package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewProject1 {
    static class Student{
        String ma, ten, lop, danh;
        int diem = 10;

        public Student(String ma, String ten, String lop) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
        }
        
        void tinh(){
            for(int i = 0; i < 10; i++){
                if(this.danh.charAt(i) == 'm') this.diem -= 1;
                else if(this.danh.charAt(i) == 'v') this.diem -= 2;
            }
            if(this.diem < 0) this.diem = 0;
        }

        @Override
        public String toString() {
            tinh();
            return ma + " " + ten + " " + lop + " " + diem;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        for(int i = 1; i <= n; i++){
            String ma = sc.next();
            String danh = sc.next();
            for(int j = 0; j < n; j++){
                if(list.get(j).ma.equals(ma)){
                    list.get(j).danh = danh;
                }
            }
        }
        
        for(Student i : list){
            System.out.print(i);
            if(i.diem == 0){
                System.out.print(" KDDK");
            }
            System.out.println("");
        }
    }

}
