package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NewProject1 {
    static class Athlete {

        String name, ma;
        String dob, thucTe, thanhTich;
        LocalTime start, end;
        int xepHang, uuTien;
        long age;

        public Athlete(int id, String name, String dob, String start, String end) {
            this.ma = String.format("VDV%02d", id);
            this.name = name;
//            DateTimeFormatter f = DateTimeFormatter.ofPattern("%dd/MM/yyyy");
//            this.dob = LocalDate.parse(dob, f);
            this.dob = dob;
            DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm:ss");
            this.start = LocalTime.parse(start, f2);
            this.end = LocalTime.parse(end, f2);
            tinh();
        }

        void tinh() {
            long diff = ChronoUnit.SECONDS.between(start, end);
            long h = diff / 3600;
            long m = (diff - h * 3600) / 60;
            long s = diff - h * 3600 - m * 60;

            this.thucTe = String.format("%02d:%02d:%02d", h, m, s);

            DateTimeFormatter f2 = DateTimeFormatter.ofPattern("HH:mm:ss");

            this.age = 2021 - Long.parseLong(this.dob.split("/")[2]);

            if (this.age >= 32) {
                this.uuTien = 3;
            } else if (this.age >= 25) {
                this.uuTien = 2;
            } else if (this.age >= 18) {
                this.uuTien = 1;
            } else {
                this.uuTien = 0;
            }

            LocalTime tmp = LocalTime.parse(this.thucTe, f2);
            tmp = tmp.minusSeconds(this.uuTien);
            this.thanhTich = String.format("%02d:%02d:%02d", tmp.getHour(), tmp.getMinute(), tmp.getSecond());
            
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + thucTe + " " + String.format("%02d:%02d:%02d", 0, 0, uuTien) + " " + thanhTich + " ";
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Athlete> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Athlete(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        ArrayList<Athlete> tmp = new ArrayList<>(list);
        Collections.sort(tmp, (Athlete o1, Athlete o2) -> {
            return o1.thanhTich.compareTo(o2.thanhTich);
        });

       
        tmp.get(0).xepHang = 1;
        for (int i = 1; i < tmp.size(); i++) {
            if (tmp.get(i).thanhTich.equals(tmp.get(i - 1).thanhTich)) {
                tmp.get(i).xepHang = tmp.get(i - 1).xepHang;
            } else {
                tmp.get(i).xepHang = i + 1;
            }
        }

        for (Athlete i : list) {
            System.out.print(i);
            for (int j = 0; j < tmp.size(); j++) {
                if (tmp.get(j).ma.equals(i.ma)) {
                    System.out.println(tmp.get(j).xepHang);
                    break;
                }
            }
        }

    }

}
