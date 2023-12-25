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
        String ma, name, chucVu;
        long luongNgay, soNgay, phuCap, luongChinh, tamUng, conLai, thuNhap;

        public NhanVien(int id, String name, String chucVu, long luongNgay, long soNgay) {
            this.ma = String.format("NV%02d", id);
            this.name = name;
            this.chucVu = chucVu;
            this.luongNgay = luongNgay;
            this.soNgay = soNgay;
            tinh();
        }
        
        void tinh(){
            if("GD".equals(this.chucVu)) this.phuCap = 500;
            else if("PGD".equals(this.chucVu)) this.phuCap = 400;
            else if("TP".equals(this.chucVu)) this.phuCap = 300;
            else if("KT".equals(this.chucVu)) this.phuCap = 250;
            else this.phuCap = 100;
            
            this.luongChinh = this.luongNgay * this.soNgay;
            
            if((this.phuCap + this.luongChinh) * 2 / 3 < 25000) this.tamUng = Math.round((double) (this.phuCap + this.luongChinh) * 2 / 3 / 1000) * 1000;
            else this.tamUng = 25000;
            
            this.conLai = this.phuCap + this.luongChinh - this.tamUng;
            this.thuNhap = this.phuCap + this.luongChinh;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + phuCap + " " + luongChinh + " " + tamUng + " " + conLai;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new NhanVien(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
       
        Collections.sort(list, (NhanVien o1, NhanVien o2) -> {
            if(Long.compare(o2.thuNhap, o1.thuNhap) == 0) return o1.ma.compareTo(o2.ma);
            return Long.compare(o2.thuNhap, o1.thuNhap);   
        });
        
        for (NhanVien i : list) {
           System.out.println(i);
        }
       
    }

}
