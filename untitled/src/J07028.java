import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;
public class J07028 {
    static class MonHoc {
        String ma, ten;

        public MonHoc(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }
    }

    static class GiangVien {
        String ma, ten;
        double sum;

        public GiangVien(String ma, String ten) {
            this.ma = ma;
            this.ten = chuanHoaTen(ten);
            this.sum = 0;
        }

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

        @Override
        public String toString() {
            return ten + " " + String.format("%.2f", sum);
        }
    }

    static class GioChuan {
        GiangVien giangVien;
        MonHoc monHoc;
        double gio;

        public GioChuan(GiangVien giangVien, MonHoc monHoc, double gio) {
            this.giangVien = giangVien;
            this.monHoc = monHoc;
            this.gio = gio;
        }

    }

    static List<MonHoc> nhapMonHoc(List<MonHoc> m) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        m = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String tmp = sc.nextLine();
            m.add(new MonHoc(tmp.substring(0, 7), tmp.substring(8)));
        }
        return m;
    }

    static List<GiangVien> nhapGiangVien(List<GiangVien> m) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("GIANGVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        m = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String tmp = sc.nextLine();
            m.add(new GiangVien(tmp.substring(0, 4), tmp.substring(5)));
        }
        return m;
    }

    static List<GioChuan> nhapGioChuan(List<MonHoc> m, List<GiangVien> g, List<GioChuan> c) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("GIOCHUAN.in"));
        int n = Integer.parseInt(sc.nextLine());
        m = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String maGV = sc.next();
            String maMH = sc.next();
            GiangVien giangVien = null;
            MonHoc monHoc = null;
            for(int j = 0; j < g.size(); j++){
                if(g.get(j).ma.equals(maGV)){
                    giangVien = g.get(j);
                    break;
                }
            }
            for(int j = 0; j < m.size(); j++){
                if(m.get(j).ma.equals(maMH)){
                    monHoc = m.get(j);
                    break;
                }
            }
            c.add(new GioChuan(giangVien, monHoc, Double.parseDouble(sc.next())));
        }
        return c;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<MonHoc> m = new ArrayList<>();
        List<GiangVien> s = new ArrayList<>();
        List<GioChuan> b = new ArrayList<>();

        m = nhapMonHoc(m);
        s = nhapGiangVien(s);
        b = nhapGioChuan(m, s, b);

        for(GiangVien giangVien : s){
            for(GioChuan gioChuan : b){
                if(gioChuan.giangVien.ma.equals(giangVien.ma)){
                    giangVien.sum += gioChuan.gio;
                }
            }
            System.out.println(giangVien);
        }
    }
}
