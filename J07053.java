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
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {

    private static class Student {

        int stt, age, mark;
        double lt, th, bonus;
        String ma, name, date, status;

        private static String chuanHoaTen(String name) {
            name = name.replaceAll("\\s+", " ").trim();
            String[] arr = name.split("\\s+");
            int n = arr.length;
            String res = "";
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i].toLowerCase();
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                res += arr[i];
                if (i != n - 1) {
                    res += " ";
                }
            }
            return res;
        }

        private static String chuanHoaDate(String date) {
            if (date.charAt(1) == '/') {
                date = "0" + date;
            }
            if (date.charAt(4) == '/') {
                date = date.substring(0, 3) + "0" + date.substring(3);
            }
            return date;
        }

        private void tinhDiem() {
            Double tmp = 0.0;
            if (lt >= 8 && th >= 8) {
                bonus = 1;
            } else if (lt >= 7.5 && th >= 7.5) {
                bonus = 0.5;
            } else {
                bonus = 0;
            }
            tmp = (lt + th) / 2 + bonus;
            if (tmp > 10) {
                mark = 10;
            } else {
                mark = (int) Math.round(tmp);
            }
        }

        private void xepLoai() {
            switch (mark) {
                case 10:
                    status = "Xuat sac";
                    break;
                case 9:
                    status = "Xuat sac";
                    break;
                case 8:
                    status = "Gioi";
                    break;
                case 7:
                    status = "Kha";
                    break;
                case 6:
                    status = "Trung binh";
                    break;
                case 5:
                    status = "Trung binh";
                    break;
                default:
                    status = "Truot";
                    break;
            }
        }

        public Student(int stt, String name, String date, double lt, double th) {
            this.stt = stt;
            this.ma = String.format("PH%02d", stt);
            this.lt = lt;
            this.th = th;
            this.name = chuanHoaTen(name);
            this.date = chuanHoaDate(date);
            this.age = Integer.parseInt("2021") - Integer.parseInt(date.substring(date.length() - 4));
            tinhDiem();
            xepLoai();
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + age + " " + mark + " " + status;
        }
    }
        

    public static void main(String[] args) throws IOException {
        List<Student> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Student(i, in.nextLine(), in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        for (Student i : ds) {
            System.out.println(i);
        }
    }

}
