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

    static class Product{
        String ma, ten, hang;
        long sl, sum, donGia, tienThue, thanhTien;
        double thue;

        public Product(String ma, long sl) {
            this.ma = ma;
            this.sl = sl;
            tinh();
        }
        
        private void tinh(){
            switch (this.ma.charAt(0)) {
                case 'X':
                    this.donGia = 128000;
                    this.thue = 3;
                    break;
                case 'D':
                    this.donGia = 11200;
                    this.thue = 3.5;
                    break;
                case 'N':
                    this.donGia = 9700;
                    this.thue = 2;
                    break;
                default:
                    break;
            }
            
            String tmp = this.ma.substring(this.ma.length() - 2);
            switch (tmp) {
                case "BP":
                    this.hang = "British Petro";
                    break;
                case "ES":
                    this.hang = "Esso";
                    break;
                case "SH":
                    this.hang = "Shell";
                    break;
                case "CA":
                    this.hang = "Castrol";
                    break;
                case "MO":
                    this.hang = "Mobil";
                    break;
                default:
                    this.hang = "Trong Nuoc";
                    this.thue = 0;
                    break;
            }
            
            this.sum = this.sl * this.donGia;
            this.tienThue = (long) ((this.thue * this.sum ) / 100);
            this.thanhTien = this.sum + this.tienThue;
        }

        @Override
        public String toString() {
            return  ma + " " + hang + " " + donGia + " " + tienThue + " " + thanhTien;
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(sc.next(), Long.parseLong(sc.next())));
        }

//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                if(Double.compare(o2.sum, o1.sum) == 0){
////                    return o1.ma.compareTo(o2.ma);
////                }
//                return Double.compare(o2.sum, o1.sum);
//            }
//
//        });
        for (Product i : list) {
            System.out.println(i);
        }

    }

}
