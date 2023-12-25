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
        String ma, ten, loai;
        double x;

        public Product(String ma, String ten, String loai) {
            this.ma = ma;
            this.ten = ten;
            this.loai = loai;
            if(null != loai) switch (loai) {
                case "A":
                    x = 0.08;
                    break;
                case "B":
                    x = 0.05;
                    break;
                case "C":
                    x = 0.02;
                    break;
                default:
                    break;
            }
        }

    }
    
    static class Nhap{
        Product sp;
        long nhapSl, nhapGia, xuatSl, nhap, xuat;

        public Nhap(Product sp, long nhapSl, long nhapGia, long xuatSl) {
            this.sp = sp;
            this.nhapSl = nhapSl;
            this.nhapGia = nhapGia;
            this.xuatSl = xuatSl;
            tinh();
        }
        
        private void tinh(){
            this.nhap = this.nhapSl * this.nhapGia;
            this.xuat = Math.round(this.xuatSl * this.nhapGia * (1 + sp.x) * 100 / 100);
        }

        @Override
        public String toString() {
            return sp.ma + " " + sp.ten + " " + nhap + " " + xuat;
        }
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

//        Collections.sort(list2, new Comparator<Match>() {
//            @Override
//            public int compare(Match o1, Match o2) {
//                if(Double.compare(o2.sum, o1.sum) == 0){
//                    return o1.clb.name.compareTo(o2.clb.name);
//                }
//                return Double.compare(o2.sum, o1.sum);
//            }
//
//        });
        int m = Integer.parseInt(sc.nextLine());
        List<Nhap> list2 = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            String ma = sc.next();
            for(Product j : list){
                if(j.ma.equals(ma)){
                    list2.add(new Nhap(j, Long.parseLong(sc.next()), Long.parseLong(sc.next()), Long.parseLong(sc.next())));
                }
            }
        }
        for (Nhap i : list2) {
            System.out.println(i);
        }

    }

}
