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

        String name, ma;
        double d1, d2, d3, d;
        int stt, hang;
        
        private static String chuanHoaTen(String name){
            name = name.replaceAll("\\s+", " ").trim();
            String[] arr = name.split("\\s+");
            int n = arr.length;
            String res = "";
            for(int i = 0; i < n; i++){
                arr[i] = arr[i].toLowerCase();
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                res += arr[i];
                if(i != n - 1) res += " ";
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
            d = (3 * d1 + 3 * d2 + 2 * d3)/8;
        }

        public Student(int stt, String name, double d1, double d2, double d3) {
            this.stt = stt;
            this.ma = String.format("SV%02d", stt);
            this.name = chuanHoaTen(name);
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
            tinhDiem();
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + String.format("%.2f", d) + " " + hang;
        }
    }
        

    public static void main(String[] args) throws IOException {
        List<Student> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Student(i, in.nextLine(), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine()), Double.parseDouble(in.nextLine())));
        }
        
        Collections.sort(ds, (Student o1, Student o2) -> {
            if(Double.compare(o2.d, o1.d) == 0){
                return o1.ma.compareTo(o2.ma);
            }
            return Double.compare(o2.d, o1.d);
        });
        
        ds.get(0).hang = 1;
        for(int i = 1; i < ds.size(); i++){
            if(ds.get(i).d == ds.get(i - 1).d){
                ds.get(i).hang = ds.get(i - 1).hang;
            }
            else{
                ds.get(i).hang = i + 1;
            }
        }
        
        for(Student i : ds){
            System.out.println(i);
        }
    }

}
