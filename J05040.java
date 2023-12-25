package javaapplication1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {

    static class NhanVien {

        int id;
        String ma, name, chuc;
        long luongNgay, soNgay, luongThang, thuong, phuCap, sum;

        public NhanVien(int id, String name, long luongNgay, long soNgay, String chuc) {
            this.id = id;
            this.ma =  String.format("NV%02d", id);
            this.name = name;
            this.chuc = chuc;
            this.luongNgay = luongNgay;
            this.soNgay = soNgay;
            tinh();
        }
        
        private void tinh(){
            this.luongThang = this.luongNgay * this.soNgay;
            
            if(this.soNgay >= 25) this.thuong = this.luongThang * 20 / 100;
            else if(this.soNgay >= 22) this.thuong = this.luongThang * 10 / 100;
            else this.thuong = 0;
            
            if(null != this.chuc) switch (this.chuc) {
                case "GD":
                    this.phuCap = 250000;
                    break;
                case "PGD":
                    this.phuCap = 200000;
                    break;
                case "TP":
                    this.phuCap = 180000;
                    break;
                case "NV":
                    this.phuCap = 150000;
                    break;
                default:
                    break;
            }
            
            this.sum = this.luongThang + this.thuong + this.phuCap;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + luongThang + " " + thuong + " " + phuCap + " " + sum;
        }

        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new NhanVien(i, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine()));
        }
//        Collections.sort(list, new Comparator<Product>(){
//            @Override
//            public int compare(Product o1, Product o2) {
//                return Long.compare(o2.ban, o1.ban);
//            }
//        });
        long sum = 0;
        for (NhanVien i : list) {
            System.out.println(i);
            sum += i.sum;
        }
       
    }

}
