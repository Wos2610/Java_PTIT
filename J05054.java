package javaapplication1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaApplication1 {

    static class Student {

        int id, xepHang;
        private String ma, name, xepLoai;
        private double diem;

        public Student(int id, String name, double diem) {
            this.id = id;
            this.ma = String.format("HS%02d", id);
            this.name = name;
            this.diem = diem;
            tinh();
        }

        private void tinh() {
            if (this.diem >= 9) {
                this.xepLoai = "Gioi";
            } else if (this.diem >= 7) {
                this.xepLoai = "Kha";
            } else if (this.diem >= 5) {
                this.xepLoai = "Trung Binh";
            } else {
                this.xepLoai = "Yeu";
            }

        }

        @Override
        public String toString() {
            return ma + " " + name + " " + diem + " " + xepLoai + " ";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(i, sc.nextLine(), Double.parseDouble(sc.nextLine())));
        }
        ArrayList<Student> tmp = new ArrayList<>(list);
        Collections.sort(tmp, (Student o1, Student o2) -> {
            return Double.compare(o2.diem, o1.diem);
        });

        for (Student i : list) {
            System.out.print(i);
            for (int j = 0; j < tmp.size(); j++) {
                if (tmp.get(j).ma.equals(i.ma)) {
                    if (j != 0 && tmp.get(j).diem == tmp.get(j - 1).diem) {
                        tmp.get(j).xepHang = tmp.get(j - 1).xepHang;
                    } else {
                        tmp.get(j).xepHang = j + 1;
                    }
                    System.out.println(tmp.get(j).xepHang);
                }
            }
        }

    }

}
