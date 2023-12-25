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
    
    static class ThiSinh{
        String ma, ten, status;
        double x1, x2, x3, bonus, sum;

        public ThiSinh(String ma, String ten, double x1, double x2, double x3) {
            this.ma = ma;
            this.ten = chuanHoaTen(ten);
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.tinh();
        }
        
        private void tinh(){
            switch (this.ma.charAt(2)) {
                case '1':
                    this.bonus = 0.5;
                    break;
                case '2':
                    this.bonus = 1.0;
                    break;
                default:
                    this.bonus = 2.5;
                    break;
            }
            
            this.sum = 2*this.x1 + this.x2 + this.x3 + this.bonus;
        }
        
        private String chuanHoaTen(String s){
            s = s.trim().replaceAll("\\s+", " ");
            String[] a = s.split("\\s+");
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
                if(i != a.length - 1) res += " ";
            }
            return res;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + NumberFormat.getInstance().format(bonus) + " " + NumberFormat.getInstance().format(sum) + " " + status;
        }
        
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<ThiSinh> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        
        Collections.sort(a, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(Double.compare(o1.sum, o2.sum) == 0) return o1.ma.compareTo(o2.ma);
                return Double.compare(o2.sum, o1.sum);
            }
         
        });
        
        Double chuan  = a.get(m - 1).sum;
        for(ThiSinh i : a){
            if(i.sum >= chuan) i.status = "TRUNG TUYEN";
            else i.status = "TRUOT";
        }
        System.out.println(chuan);
        for(ThiSinh i : a){
            System.out.println(i);
        }
    }

}
