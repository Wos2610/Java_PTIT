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
        int id;
        String name, ma, stt, loai;
        long donGia, soLuong, giamGia, thanhTien;

        public Product(String name, String ma, long donGia, long soLuong) {
            this.name = name;
            this.ma = ma;
            this.donGia = donGia;
            this.soLuong = soLuong;
            tinh();
        }

        private void tinh(){
            this.stt = this.ma.substring(1,4);
            this.loai = this.ma.substring(this.ma.length() - 1);
            
            this.thanhTien = this.donGia * this.soLuong;
            
            if("1".equals(this.loai)) this.giamGia = 50 * this.thanhTien / 100;
            else if("2".equals(this.loai)) this.giamGia = 30 * this.thanhTien / 100; 
            
            this.thanhTien -= this.giamGia;
        }

        @Override
        public String toString() {
            return name + " " + ma + " " + stt + " " + giamGia + " " + thanhTien;
        }
      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }

//        Collections.sort(list, (Product o1, Product o2) -> {
//            return Long.compare(o2.sum, o1.sum);
//        });
        for (Product i : list) {
            System.out.println(i);
        }

    }
}
