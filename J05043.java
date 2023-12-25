package danhsachsinhvien1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    static class NhanVien{
        int id;
        String ten, chuc, ma;
        long coBan, ngay, bonus, chinh, ung, con;

        public NhanVien(int id, String ten, String chuc, long coBan, long ngay) {
            this.id = id;
            this.ma = String.format("NV%02d", id);
            this.ten = ten;
            this.chuc = chuc;
            this.coBan = coBan;
            this.ngay = ngay;
            this.tinh();
        }
        
        private void tinh(){
            this.chinh = this.coBan * this.ngay;
            switch (this.chuc) {
                case "GD":
                    this.bonus = 500;
                    break;
                case "PGD":
                    this.bonus = 400;
                    break;
                case "TP":
                    this.bonus = 300;
                    break;
                case "KT":
                    this.bonus = 250;
                    break;
                default:
                    this.bonus = 100;
                    break;
            }
            
            long sum = this.chinh + this.bonus;
            if((double)(sum * 2 / 3) < 25000) this.ung = Math.round((double) (sum * 2 / 3) / 1000) * 1000;
            else this.ung = 25000;
            
            this.con = sum - this.ung;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + bonus + " " + chinh + " " + ung + " " + con;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<NhanVien> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new NhanVien(i + 1, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        
        for(NhanVien i : a){
            System.out.println(i);
        }
    }

}



