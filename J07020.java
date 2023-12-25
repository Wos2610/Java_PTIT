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
        String ma, ten, gioi, date, dia;

        public Khach(int id, String ten, String gioi, String date, String dia) {
            this.id = id;
            this.ma = String.format("KH%03d", id);
            this.ten = ten;
            this.gioi = gioi;
            this.date = date;
            this.dia = dia;
        }
    }
    
    static class Hang{
        int id;
        String ma, ten, dv;
        long mua, ban;

        public Hang(int id, String ten, String dv, long mua, long ban) {
            this.id = id;
            this.ma = String.format("MH%03d", id);
            this.ten = ten;
            this.dv = dv;
            this.mua = mua;
            this.ban = ban;
        }
        
        
    }
    
    static class HoaDon{
        int id;
        String ma;
        Khach khach;
        Hang hang;
        long num;
        long sum = 0;

        public HoaDon(int id, Khach khach, Hang hang, long num) {
            this.id = id;
            this.ma = String.format("HD%03d", id);
            this.khach = khach;
            this.hang = hang;
            this.num = num;
            this.sum = this.num * this.hang.ban;
        }

        @Override
        public String toString() {
            return ma + " " + khach.ten + " " + khach.dia + " " + hang.ten + " " + hang.dv + " " + hang.mua + " " + hang.ban + " " + num + " " + sum;
        }
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s1 = new Scanner(new File("KH.in"));
        Scanner s2 = new Scanner(new File("MH.in"));
        Scanner s3 = new Scanner(new File("HD.in"));
        
        List<Khach> a = new ArrayList<>();
        List<Hang> b = new ArrayList<>();
        List<HoaDon> c = new ArrayList<>();
        
        int n = Integer.parseInt(s1.nextLine());
        for(int i = 0; i < n; i++){
            a.add(new Khach(i + 1, s1.nextLine(), s1.nextLine(), s1.nextLine(), s1.nextLine()));
        }
        
        int m = Integer.parseInt(s2.nextLine());
        for(int i = 0; i < m; i++){
            b.add(new Hang(i + 1, s2.nextLine(), s2.nextLine(), Long.parseLong(s2.nextLine()), Long.parseLong(s2.nextLine())));
        }
        
        int k = Integer.parseInt(s3.nextLine());
        for(int i = 0; i < k; i++){
            String x1 = s3.next();
            String x2 = s3.next();
            int x3 = s3.nextInt();
            
            Khach khach = null;
            Hang hang = null;
            
            for(Khach j : a){
                if(j.ma.equals(x1)) khach = j;
            }
            
            for(Hang j : b){
                if(j.ma.equals(x2)) hang = j;
            }
            c.add(new HoaDon(i + 1, khach, hang, x3));
        }
        
        for(HoaDon i : c){
            System.out.println(i);
        }
    }

}


