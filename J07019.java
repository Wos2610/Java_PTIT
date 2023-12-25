package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    static class Loai{
        String ma, ten;
        long d1, d2;
        int type;

        public Loai(String ma, String ten, long d1, long d2) {
            this.ma = ma;
            this.ten = ten;
            this.d1 = d1;
            this.d2 = d2;
        }
        
        
    }
    
    static class HoaDon{
        String ma;
        long number;
        int id;
        String ma1;
        Loai loai;
        long sum = 0;
        long giam = 0;
        long tra = 0;

        public HoaDon(int id, String ma, Loai loai, long number) {
            this.ma = ma;
            this.loai = loai;
            this.number = number;
            this.ma1 = ma + String.format("-%03d", id);
            this.tinh();
        }
        
        private void tinh(){
            if(loai.type == 1){
                sum = loai.d1 * number;
            }
            else{
                sum = loai.d2 * number;
            }
            
            if(number >= 150) giam = 50 *sum / 100;
            else if(number >= 100) giam = 30 * sum / 100;
            else if(number >= 50) giam = 15 * sum / 100;
            
            tra = sum - giam;
        }

        @Override
        public String toString() {
            return ma1 + " " + loai.ten + " " + giam + " " + tra;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        List<Loai> a = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            a.add(new Loai(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        sc.close();
        
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        List<HoaDon> b = new ArrayList<>();
        int m = Integer.parseInt(sc2.nextLine());
        for(int i = 0; i < m; i++){
            String ma = sc2.next();
            int num = sc2.nextInt();
            Loai x = null;
            for(Loai j : a){
                if(j.ma.equals(ma.substring(0, 2))){
                    x = j;
                    x.type = Integer.parseInt(ma.substring(2));
                }
            }
            
            b.add(new HoaDon(i + 1, ma, x, num));
        }
        
        for(HoaDon i : b){
            System.out.println(i);
        }
    }

}


