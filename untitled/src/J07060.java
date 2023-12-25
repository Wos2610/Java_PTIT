import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class J07060 {
    static class MonHoc{
        String ma, ten, hinhThuc;

        public MonHoc(String ma, String ten, String hinhThuc) {
            this.ma = ma;
            this.ten = ten;
            this.hinhThuc = hinhThuc;
        }
    }

    static class CaThi{
        int id;
        String ma, ngay, gio, phong;

        public CaThi(int id, String ngay, String gio, String phong) {
            this.id = id;
            this.ma = String.format("C%03d", id);
            this.ngay = ngay;
            this.gio = gio;
            this.phong = phong;
        }
    }

    static class LichThi{
        MonHoc monHoc;
        CaThi caThi;
        String maNhom;
        int soSV;

        LocalDateTime dateTime;

        public LichThi(MonHoc monHoc, CaThi caThi, String maNhom, int soSV) {
            this.monHoc = monHoc;
            this.caThi = caThi;
            this.maNhom = maNhom;
            this.soSV = soSV;

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            this.dateTime = LocalDateTime.parse(caThi.ngay + " " + caThi.gio, formatter);
        }

        @Override
        public String toString() {
            return caThi.ngay + " " + caThi.gio + " " + caThi.phong + " " + monHoc.ten + " " + maNhom + " " + soSV;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        int n1 = Integer.parseInt(sc1.nextLine());
        List<MonHoc> m = new ArrayList<>();
        for(int i = 1; i <= n1; i++){
            m.add(new MonHoc(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        int n2 = Integer.parseInt(sc2.nextLine());
        List<CaThi> c = new ArrayList<>();
        for(int i = 1; i <= n2; i++){
            c.add(new CaThi(i, sc2.nextLine(), sc2.nextLine(), sc2.nextLine()));
        }

        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        int n3 = Integer.parseInt(sc3.nextLine());
        List<LichThi> l = new ArrayList<>();
        for(int i = 1; i <= n3; i++){
            String maCa = sc3.next();
            String maMon = sc3.next();
            MonHoc monHoc = null;
            CaThi caThi = null;
            for(int j = 0; j < n1; j++){
                if(m.get(j).ma.equals(maMon)){
                    monHoc = m.get(j);
                    break;
                }
            }
            for(int j = 0; j < n2; j++){
                if(c.get(j).ma.equals(maCa)){
                    caThi = c.get(j);
                    break;
                }
            }

            l.add(new LichThi(monHoc, caThi, sc3.next(), sc3.nextInt()));
        }

        Collections.sort(l, new Comparator<LichThi>(){

            @Override
            public int compare(LichThi o1, LichThi o2) {
                if(o1.dateTime.isEqual(o2.dateTime)){
                    return o1.caThi.ma.compareTo(o2.caThi.ma);
                }
                return o1.dateTime.compareTo(o2.dateTime);
            }
        });
        for(LichThi i : l){
            System.out.println(i);
        }
    }
}
