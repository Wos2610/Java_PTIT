package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewProject1 {

    static class SinhVien{
        String ma, ten, sdt, tenBT;
        int nhom;
        
        public SinhVien(String ma, String ten, String sdt, int nhom) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
            this.nhom = nhom;
        }

//        private String chuanHoaTen(String s){
//            String[] a = s.split("\\s+");
//            String res = "";
//            for(int i = 0; i < a.length; i++){
//                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
//                if(i != a.length - 1){
//                    res += " ";
//                }
//            }
//            return res;
//        }
        
        @Override
        public String toString() {
            return ma + " " + ten + " " + sdt + " " + nhom + " " + tenBT;
        }
    }
    
    static class BaiTap{
        int stt;
        String ten;

        public BaiTap(int stt, String ten) {
            this.stt = stt;
            this.ten = ten;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split("\\s+");
        int n = Integer.parseInt(tmp[0]);
        List<SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        
        Collections.sort(list, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.ma.compareTo(o2.ma);
            }
            
        });

        int m = Integer.parseInt(tmp[1]);
        List<BaiTap> list2 = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            list2.add(new BaiTap(i, sc.nextLine()));
        }
        
        for(SinhVien i : list){
            for(BaiTap j : list2){
                if(j.stt == i.nhom){
                    i.tenBT = j.ten;
                    break;
                }
            }
            System.out.println(i);
        }
        
    }

}
