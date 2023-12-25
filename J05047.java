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
        String ma, name;
        long soLuong, donGia, phanTram, tienCK, sum;

        public Product(String name, long soLuong, long donGia) {
            this.name = name;
            this.soLuong = soLuong;
            this.donGia = donGia;
            String[] names = name.toUpperCase().split("\\s+");
            this.ma = String.valueOf(names[0].charAt(0)) + String.valueOf(names[1].charAt(0));
            tinh();
        }

        void tinh() {
            if (this.soLuong > 10) {
                this.phanTram = 5;
            } else if (this.soLuong >= 8) {
                this.phanTram = 2;
            } else if (this.soLuong >= 5) {
                this.phanTram = 1;
            } else {
                this.phanTram = 0;
            }

            this.tienCK = (this.donGia * this.soLuong) * this.phanTram / 100;
            this.sum = this.donGia * this.soLuong - this.tienCK;

            if (x.containsKey(this.ma)) {
                this.id = x.get(this.ma) + 1;
                x.put(this.ma, this.id);
            } else {
                this.id = 1;
                x.put(this.ma, 1);
            }
            this.ma += String.format("%02d", this.id);
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + tienCK + " " + sum;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Product> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Product(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }

        Collections.sort(list, (Product o1, Product o2) -> {
            return Long.compare(o2.tienCK, o1.tienCK);
        });
        for (Product i : list) {
            System.out.println(i);
        }

    }
}
