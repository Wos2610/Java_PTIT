package javaapplication1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
    static Map<String, Integer> x = new HashMap<>();
    static class Product {
        int id;
        String ma, name;
        long soLuong, donGia, phanTram, tienCK, sum;

        public Product(String name, long soLuong, long donGia) {
            this.name = name;
            this.soLuong = soLuong;
            this.donGia = donGia;
            String[] names = name.toUpperCase().split("\\s+");
            this.ma = String.valueOf(names[0].charAt(0)) + String.valueOf(names[1].charAt(0));
            tinh();
        }
        
        void tinh(){
            if(this.soLuong > 10) this.phanTram = 5;
            else if (this.soLuong >= 8) this.phanTram = 2;
            else if (this.soLuong >= 5) this.phanTram = 1;
            else this.phanTram = 0;
            
            this.tienCK = (this.donGia * this.soLuong) * this.phanTram / 100;
            this.sum = this.donGia * this.soLuong - this.tienCK;
            
            if(x.containsKey(this.ma)) {
                this.id = x.get(this.ma) + 1;
                x.put(this.ma, this.id);
            }
            else{
                this.id = 1;
                x.put(this.ma, 1);
            }
            this.ma += String.format("%02d", this.id);
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + tienCK + " " + sum;
        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
       
//        Collections.sort(list, (NhanVien o1, NhanVien o2) -> {
//            if(Long.compare(o2.thuNhap, o1.thuNhap) == 0) return o1.ma.compareTo(o2.ma);
//            return Long.compare(o2.thuNhap, o1.thuNhap);   
//        });
        
        for (Product i : list) {
           System.out.println(i);
        }
       
    }

}
