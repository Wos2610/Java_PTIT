package danhsachsinhvien1;

//import java.io.*;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewProject1 {
    static class KhachHang{
        String ma, name, gender, dob, address;
        LocalDate date;

        public KhachHang(int id, String name, String gender, String dob, String address) {
            this.ma = String.format("KH%03d", id);
            this.name = chuanHoaTen(name);
            this.gender = gender;
            this.dob = chuanHoaDate(dob);
            this.address = address;
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            date = LocalDate.parse(this.dob, f);
//            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
//            try {
//                this.date = f.parse(this.dob);
//            } catch (ParseException ex) {
//                
//            }
        }
        
        private String chuanHoaTen(String s){
            s = s.trim().replaceAll("\\s+", " ");
            String[] a = s.split("\\s+");
            String res = "";
            for(int i = 0; i < a.length; i++){
                res += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase();
                if(i != a.length - 1) res += " ";
            }
            return res;
        }
        
        private String chuanHoaDate(String s){
            String[] ss = s.split("/");
            if (ss[0].length() != 2) ss[0] = "0" + ss[0];
            if (ss[1].length() != 2) ss[1] = "0" + ss[1];
            s = ss[0] + "/" + ss[1] + "/" + ss[2];
            return s;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + gender + " " + address + " " + dob;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(list, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                return o1.date.compareTo(o2.date);
            }
        });

        for(KhachHang i : list){
            System.out.println(i);
        }
        
    }

}
