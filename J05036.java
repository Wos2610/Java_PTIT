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

    static class Product {
        int id;
        String ma, name, dv;
        long nhap, sl;
        long vc, tt, ban;

        public Product(int id, String name, String dv, long nhap, long sl) {
            this.ma = String.format("MH%02d", id);
            this.name = name;
            this.dv = dv;
            this.nhap = nhap;
            this.sl = sl;
            this.vc = Math.round((double) 0.05 * nhap * sl);
            this.tt = Math.round(nhap * sl + this.vc);
            this.ban = Math.round((double) this.tt * 102 / 100);
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + dv + " " + vc + " " + tt + " " + ban;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(i, sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }

       for(Product i : list){
           System.out.println(i);
       }
    }

}
