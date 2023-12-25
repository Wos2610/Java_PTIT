package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewProject1 {
    static class GiaoVien{
        String ma, ten, chucVu;
        long basic, bonus, sum, heSo;

        public GiaoVien(String ma, String ten, long basic) {
            this.ma = ma;
            this.ten = ten;
            this.basic = basic;
            tinh();
        }
        
        private void tinh(){
            this.chucVu = this.ma.substring(0, 2);
            this.heSo = Long.parseLong(this.ma.substring(2));
            
            if(null != this.chucVu) switch (this.chucVu) {
                case "HT":
                    this.bonus = 2000000;
                    break;
                case "HP":
                    this.bonus = 900000;
                    break;
                case "GV":
                    this.bonus = 500000;
                    break;
                default:
                    break;
            }
            
            this.sum = this.basic * this.heSo + this.bonus;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + heSo + " " + bonus + " " + sum;
        }    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(tmp[0]);
        List<GiaoVien> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new GiaoVien(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        
//        Collections.sort(list, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                return o1.ma.compareTo(o2.ma);
//            }
//            
//        });

        int ht = 0;
        int hp = 0;
        
        for(GiaoVien i : list){
            if("HT".equals(i.chucVu)) ht++;
            else if("HP".equals(i.chucVu)) hp++;
            
            if(("HT".equals(i.chucVu) && ht < 2) || ("HP".equals(i.chucVu) && hp < 3) || "GV".equals(i.chucVu)){
                System.out.println(i);
            }
        }
        
    }

}
