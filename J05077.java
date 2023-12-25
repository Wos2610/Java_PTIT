package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewProject1 {

    static class PhongBan{
        String ma, ten;

        public PhongBan(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }
    }
    
    static class NhanVien{
        String ma, ten;
        long coBan, number, sum;
        PhongBan phong;

        public NhanVien(String ma, String ten, long coBan, long number, PhongBan phong) {
            this.ma = ma;
            this.ten = ten;
            this.coBan = coBan;
            this.number = number;
            this.phong = phong;
            tinh();
        }
        
        private void tinh(){
            String x1 = "" + this.ma.charAt(0);
            Long x2 = Long.valueOf(this.ma.substring(1, 3));
            Integer heSo = 1;
            if(null != x1)switch (x1) {
                case "A":
                    if(x2 >= 1 && x2 <= 3){
                        heSo = 10;
                    }
                    else if(x2 >= 4 && x2 <= 8){
                        heSo = 12;
                    }
                    else if(x2 >= 9 && x2 <= 15){
                        heSo = 14;
                    }
                    else if(x2 >= 16){
                        heSo = 20;
                    }   break;
                case "B":
                    if(x2 >= 1 && x2 <= 3){
                        heSo = 10;
                    }
                    else if(x2 >= 4 && x2 <= 8){
                        heSo = 11;
                    }
                    else if(x2 >= 9 && x2 <= 15){
                        heSo = 13;
                    }
                    else if(x2 >= 16){
                        heSo = 16;
                    }   break;
                case "C":
                    if(x2 >= 1 && x2 <= 3){
                        heSo = 9;
                    }
                    else if(x2 >= 4 && x2 <= 8){
                        heSo = 10;
                    }
                    else if(x2 >= 9 && x2 <= 15){
                        heSo = 12;
                    }
                    else if(x2 >= 16){
                        heSo = 14;
                    }   break;
                case "D":
                    if(x2 >= 1 && x2 <= 3){
                        heSo = 8;
                    }
                    else if(x2 >= 4 && x2 <= 8){
                        heSo = 9;
                    }
                    else if(x2 >= 9 && x2 <= 15){
                        heSo = 11;
                    }
                    else if(x2 >= 16){
                        heSo = 13;
                    }   break;
                default:
                    break; 
            }
            
            this.sum = this.coBan * this.number * heSo;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + phong.ten + " " + sum + "000";
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<PhongBan> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String tmp = sc.nextLine();
            list.add(new PhongBan(tmp.substring(0,2), tmp.substring(3)));
        }

        int m = Integer.parseInt(sc.nextLine());
        List<NhanVien> list2 = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long coBan = Long.parseLong(sc.nextLine());
            long number = Long.parseLong(sc.nextLine());
            String maPhong = ma.substring(ma.length() - 2);
            for(int j = 0; j < n; j++){
                if(list.get(j).ma.equals(maPhong)){
                    list2.add(new NhanVien(ma, ten, coBan, number, list.get(j)));
                    break;
                }
            }
        }
        
        for(NhanVien i : list2){
            System.out.println(i);
        }
    }

}
