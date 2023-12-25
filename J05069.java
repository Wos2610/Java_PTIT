package javaapplication1;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

    static class CLB {
        String ma, name;
        long gia;

        public CLB(String ma, String name, long gia) {
            this.ma = ma;
            this.name = name;
            this.gia = gia;
        }

    }

    static class Match{
        CLB clb;
        String ma;
        long sl, sum;

        public Match(CLB clb, String ma, long sl) {
            this.clb = clb;
            this.ma = ma;
            this.sl = sl;
            tinh();
        }

        private void tinh(){
            this.sum = this.sl * this.clb.gia;
        }

        @Override
        public String toString() {
            return ma + " " + clb.name + " " + sum;
        }
        
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<CLB> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new CLB(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        }
        List<Match> list2 = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= m; i++){
            String ma = sc.next();
            CLB tmp = null;
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).ma.equals(ma.substring(1, 3))){
                    tmp = list.get(j);
                    break;
                }
            }
            list2.add(new Match(tmp, ma, Long.parseLong(sc.next())));
        }

//        Collections.sort(list, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
////                if(Double.compare(o2.sum, o1.sum) == 0){
////                    return o1.ma.compareTo(o2.ma);
////                }
//                return Double.compare(o2.thanhTien, o1.thanhTien);
//            }
//
//        });
        for (Match i : list2) {
            System.out.println(i);
        }

    }

}
