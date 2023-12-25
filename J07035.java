import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;

public class J07035 {
    static class MonHoc {
        String ma, ten;
        int soTC;

        public MonHoc(String ma, String ten, int soTC) {
            this.ma = ma;
            this.ten = ten;
            this.soTC = soTC;
        }
    }

    static class SinhVien {
        String ma, ten, lop, mail;

        public SinhVien(String ma, String ten, String lop, String mail) {
            this.ma = ma;
            this.ten = chuanHoaTen(ten);
            this.lop = lop;
            this.mail = mail;
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
    }

    static class BangDiem {
        SinhVien sinhVien;
        MonHoc monHoc;
        double diem;

        public BangDiem(SinhVien sinhVien, MonHoc monHoc, double diem) {
            this.sinhVien = sinhVien;
            this.monHoc = monHoc;
            this.diem = diem;
        }

        @Override
        public String toString() {
            return sinhVien.ma + " " + sinhVien.ten + " " + sinhVien.lop + " " + NumberFormat.getInstance().format(diem);
        }
    }

    static List<MonHoc> nhapMonHoc(List<MonHoc> m) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        m = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            m.add(new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        return m;
    }

    static List<SinhVien> nhapSinhVien(List<SinhVien> m) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        m = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            m.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        return m;
    }

    static void nhapBangDiem(List<MonHoc> m, List<SinhVien> s, List<BangDiem> b) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = Integer.parseInt(sc.nextLine());
        b = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String maSV = sc.next();
            String maMon = sc.next();
            SinhVien sinhVien = null;
            MonHoc monHoc = null;
            for(int j = 0; j < m.size(); j++){
                if(m.get(j).ma.equals(maMon)){
                    monHoc = m.get(j);
                    break;
                }
            }
            for(int j = 0; j < s.size(); j++){
                if(s.get(j).ma.equals(maSV)){
                    sinhVien = s.get(j);
                    break;
                }
            }
            b.add(new BangDiem(sinhVien, monHoc, Double.parseDouble(sc.next())));
        }

        Collections.sort(b, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if(Double.compare(o2.diem, o1.diem) == 0){
                    return o1.sinhVien.ma.compareTo(o2.sinhVien.ma);
                }
                return Double.compare(o2.diem, o1.diem);
            }
        });

        sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= a; i++){
            String x = sc.nextLine();
            for(int j = 0; j < m.size(); j++){
                if(m.get(j).ma.equals(x)){
                    System.out.println("BANG DIEM MON " + m.get(j).ten + ":");
                    break;
                }
            }
            for(int j = 0; j < n; j++){
                if(b.get(j).monHoc.ma.equals(x)){
                    System.out.println(b.get(j));
                }
            }
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<MonHoc> m = new ArrayList<>();
        List<SinhVien> s = new ArrayList<>();
        List<BangDiem> b = new ArrayList<>();

        m = nhapMonHoc(m);
        s = nhapSinhVien(s);
        nhapBangDiem(m, s, b);
    }
}
