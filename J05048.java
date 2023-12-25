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

    static Map<String, Integer> x = new HashMap<>();

    static class Product {

        String ma;
        long nhap, xuat, donGia, tien, thue;

        public Product(String ma, long nhap) {
            this.ma = ma;
            this.nhap = nhap;
            tinh();
        }
        
        private void tinh(){
            char x0 = this.ma.charAt(0);
            char xn = this.ma.charAt(this.ma.length() - 1);
            if(x0 == 'A') this.xuat = Math.round((double)0.6 * this.nhap);
            else if(x0 == 'B') this.xuat = Math.round((double)0.7 * this.nhap);
            
            if(xn == 'Y') this.donGia = 110000;
            else if(xn == 'N') this.donGia = 135000;
            
            this.tien = this.xuat * this.donGia;
            
            if(x0 == 'A' && xn == 'Y') this.thue = 8 * this.tien / 100;
            else if(x0 == 'A' && xn == 'N') this.thue = 11 * this.tien / 100;
            else if(x0 == 'B' && xn == 'Y') this.thue = 17 * this.tien / 100;
            else if(x0 == 'B' && xn == 'N') this.thue = 22 * this.tien / 100;
            
        }

        @Override
        public String toString() {
            return ma + " " + nhap + " " + xuat + " " + donGia + " " + tien + " " + thue;
        }
        

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(sc.nextLine(), Long.parseLong(sc.nextLine())));
        }

//        Collections.sort(list, (Product o1, Product o2) -> {
//            return Long.compare(o2.tienCK, o1.tienCK);
//        });
        for (Product i : list) {
            System.out.println(i);
        }

    }
}
