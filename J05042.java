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

    static class SinhVien {
        String name;
        long ac, submit;

        public SinhVien(String name, long ac, long submit) {
            chuanHoaTen(name);
            this.ac = ac;
            this.submit = submit;
        }
        
        void chuanHoaTen(String name){
            String[] splits = name.split("\\s+");
            this.name = "";
            for(int i = 0; i < splits.length; i++){
                this.name += (splits[i].substring(0, 1).toUpperCase() + splits[i].substring(1));
                if(i != splits.length - 1) this.name += " ";
            }
        }

        @Override
        public String toString() {
            return name + " " + ac + " " + submit;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<SinhVien> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new SinhVien(sc.nextLine(), sc.nextLong(), sc.nextLong()));
            sc.nextLine();
        }
        Collections.sort(list, (SinhVien o1, SinhVien o2) -> {
            if(Long.compare(o2.ac, o1.ac) == 0){
                if(Long.compare(o1.submit, o2.submit) == 0) return o1.name.compareTo(o2.name);
                else return Long.compare(o1.submit, o2.submit);
            }
            return Long.compare(o2.ac, o1.ac);            
        });
        
        for (SinhVien i : list) {
            System.out.println(i);
        }
       
    }

}
