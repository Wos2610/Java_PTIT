import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J07027 {
    static class SinhVien{
        String ma, ten, sdt;

        public SinhVien(String ma, String ten, String sdt) {
            this.ma = ma;
            this.ten = ten;
            this.sdt = sdt;
        }
    }

    static class BaiTap{
        int id;
        String ten;

        public BaiTap(int id, String ten) {
            this.id = id;
            this.ten = ten;
        }
    }

    static class Nhom{
        SinhVien sinhVien;
        BaiTap baiTap;

        public Nhom(SinhVien sinhVien, BaiTap baiTap) {
            this.sinhVien = sinhVien;
            this.baiTap = baiTap;
        }

        @Override
        public String toString() {
            return sinhVien.ma + " " + sinhVien.ten + " " + sinhVien.sdt + " " + baiTap.id + " " + baiTap.ten;
        }
    }

    static List<SinhVien> nhapSinhVien(List<SinhVien> m) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            m.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        return m;
    }

    static List<BaiTap> nhapBaiTap(List<BaiTap> m) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BAITAP.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            m.add(new BaiTap(i, sc.nextLine()));
        }
        return m;
    }

    static List<Nhom> nhapNhom(List<SinhVien> s, List<BaiTap> b, List<Nhom> n) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("NHOM.in"));
        int k = s.size();
        for(int i = 1; i <= k; i++){
            String maSV = sc.next();
            String maBT = sc.next();
            SinhVien sinhVien = null;
            BaiTap baiTap = null;
            for(int j = 0; j < k; j++){
                if(s.get(j).ma.equals(maSV)){
                    sinhVien = s.get(j);
                    break;
                }
            }
            for(int j = 0; j < k; j++){
                if(b.get(j).id == Integer.parseInt(maBT)){
                    baiTap = b.get(j);
                    break;
                }
            }
            n.add(new Nhom(sinhVien, baiTap));
        }
        return n;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<SinhVien> s = new ArrayList<>();
        List<BaiTap> b = new ArrayList<>();
        List<Nhom> n = new ArrayList<>();

        s = nhapSinhVien(s);
        b = nhapBaiTap(b);
        n = nhapNhom(s, b, n);

        Collections.sort(n, (o1, o2) -> {
            return o1.sinhVien.ma.compareTo(o2.sinhVien.ma);
        });

        for(Nhom i : n){
            System.out.println(i);
        }
    }
}
