package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {

    static Map<String, Integer> x = new HashMap<>();

    static class Product {
        int id;
        String ma, loai;
        long cu, moi, heSo, thanhTien, phuTroi, sum;

        public Product(int id, String loai, long cu, long moi) {
            this.ma = String.format("KH%02d", id);
            this.loai = loai;
            this.cu = cu;
            this.moi = moi;
            tinh();
        }

        private void tinh(){
            switch (this.loai) {
                case "KD":
                    this.heSo = 3;
                    break;
                case "NN":
                    this.heSo = 5;
                    break;
                case "TT":
                    this.heSo = 4;
                    break;
                case "CN":
                    this.heSo = 2;
                    break;
                default:
                    break;
            }
            
            long diff = this.moi - this.cu;
            this.thanhTien = diff * this.heSo * 550;
            
            if(diff < 50) this.phuTroi = 0;
            else if(diff <= 100) this.phuTroi = Math.round((double) this.thanhTien * 35 / 100);
            else if(diff > 100) this.phuTroi = this.thanhTien;
            
            this.sum = this.phuTroi + this.thanhTien;
        }

        @Override
        public String toString() {
            return ma + " " + heSo + " " + thanhTien + " " + phuTroi + " " + sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(i, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }

//        Collections.sort(list, (Product o1, Product o2) -> {
//            return Long.compare(o2.thue, o1.thue);
//        });
        for (Product i : list) {
            System.out.println(i);
        }

    }
}
