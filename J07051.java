package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
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
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JavaApplication1 {
    private static class Khach{
        int id;
        String ma, ten, phong; 
        LocalDate start, end;
        long bonus, sum = 0;
        long day;
        
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        public Khach(int id, String ten, String phong, String start, String end, int bonus) {
            this.id = id;
            this.ma = String.format("KH%02d", id);
            this.ten = chuanHoaTen(ten);
            this.phong = phong;
            this.start = LocalDate.parse(chuanHoaDate(start), f);
            this.end = LocalDate.parse(chuanHoaDate(end), f);
            this.bonus = bonus;
            this.tinh();
        }
        
        String chuanHoaTen(String s){
            s = s.trim().replaceAll("\\s+", " ");
            String[] a = s.split("\\s+");
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
                if(i != a.length - 1) res += " ";
            }
            return res;
        }
        
        String chuanHoaDate(String s){
            s = s.trim();
            String[] a = s.split("/");
            for(int i = 0; i < a.length; i++){
                if(a[i].length() < 2){
                    a[i] = "0" + a[i];
                }
            }
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += a[i];
                if(i != a.length - 1) res += "/";
            }
            return res;
        }
        
        void tinh(){
            long donGia = 0;
            switch (this.phong.charAt(0)) {
                case '1':
                    donGia = 25;
                    break;
                case '2':
                    donGia = 34;
                    break;
                case '3':
                    donGia = 50;
                    break;
                default:
                    donGia = 80;
                    break;
            }
            
            this.day = ChronoUnit.DAYS.between(start, end) + 1;
            this.sum = this.day * donGia + bonus;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + phong + " " + day+ " " + sum;
        }
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Khach> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new Khach(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(a, new Comparator<Khach>(){
            @Override
            public int compare(Khach o1, Khach o2) {
                return Long.compare(o2.sum, o1.sum);
            }
        });
        for(Khach i : a){
            System.out.println(i);
        }
    }

}
