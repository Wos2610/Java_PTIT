package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewProject1 {

    static class Lop{
        String ma, ten, gv;
        int nhom;

        public Lop(String ma, String ten, String nhom, String gv) {
            this.ma = ma;
            this.ten = ten;
            this.nhom = Integer.parseInt(nhom);
            this.gv = gv;
        }

        @Override
        public String toString() {
            return String.format("%02d", nhom) + " " + gv;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Lop> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Lop(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(list, (Lop o1, Lop o2) -> o1.nhom - o2.nhom);

        int m = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= m; i++) {
            String ma = sc.nextLine();
            for(int j = 0; j < n; j++){
                if(list.get(j).ma.equals(ma)){
                    System.out.printf("Danh sach nhom lop mon %s:\n", list.get(j).ten);
                    break;
                }
            }
            
            for(int j = 0; j < n; j++){
                if(list.get(j).ma.equals(ma)){
                    System.out.println(list.get(j));
                }
            }
        }
        
    }

}
