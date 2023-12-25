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
        int stt, area;
        String ma, name, status, nation;
        float mark, sum;

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
        
        private void tinhDiem(){
            sum = mark;
            if(area == 1){
                sum += 1.5;
            }
            else if(area == 2){
                sum += 1;
            }
            
            if(!nation.equals("Kinh")) sum += 1.5;
            
            if(sum >= 20.5) status = "Do";
            else status = "Truot";
        }
        
        public Student(int stt, String name, float mark, String nation, int area) {
            this.stt = stt;
            this.ma = String.format("TS%02d", stt);
            this.area = area;
            this.name = chuanHoaTen(name);
            this.nation = nation;
            this.mark = mark;
            tinhDiem();
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + sum + " " + status;
        }
        
        
        
        
    }
        

    public static void main(String[] args) throws IOException {
        List<Student> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Student(i, in.nextLine(), Float.parseFloat(in.nextLine()), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        
        Collections.sort(ds, (Student o1, Student o2) -> {
            if(o1.sum == o2.sum) return o1.ma.compareTo(o2.ma);
            return Double.compare(o2.sum, o1.sum);
        });
        
        for(Student i : ds){
            System.out.println(i);
        }
    }

}
