package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    static class Khach{
        int id;
        String ma, ten, loai;
        long start, end;
        long trong, vuot, vat, sum;

        public Khach(int id, String ten, String loai, long start, long end) {
            this.id = id;
            this.ma = String.format("KH%02d", id);
            this.ten = chuanHoaTen(ten);
            this.loai = loai;
            this.start = start;
            this.end = end;
            this.tinh();
        }
        
        private void tinh(){
            long x = end - start;
            long y = 0;
            switch (loai) {
                case "A":
                    y = 100;
                    break;
                case "B":
                    y = 500;
                    break;
                default:
                    y = 200;
                    break;
            }
            
            if(x <= y) trong = x * 450;
            else trong = y * 450;
            
            if(x > y) vuot = (x - y) * 1000;
            else vuot = 0;
            
            vat = 5 * vuot / 100;
            
            sum = trong + vuot + vat;
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
            return ma + " " + ten + " " + trong + " " + vuot + " " + vat + " " + sum;
        }
       
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        
        int n = Integer.parseInt(sc.nextLine());
        List<Khach> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new Khach(i + 1, sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt()));
            if(sc.hasNext()) sc.nextLine();
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



