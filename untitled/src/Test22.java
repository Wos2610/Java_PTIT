import java.io.File;
import java.io.IOException;
import java.util.*;

public class Test22 {
    static class SinhVien{
        String ma, ten, lop, mail, phone;

        public SinhVien(String ma, String ten, String lop, String mail, String phone) {
            this.ma = ma;
            this.ten = ten;
            this.lop = lop;
            this.mail = mail;
            this.phone = "0" + phone;
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop + " " + mail + " " + phone;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        List<SinhVien> m = new ArrayList<>();
        while(sc.hasNext()){
            m.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(m, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if(o1.lop.equals(o2.lop)){
                    return o1.ma.compareTo(o2.ma);
                }
                return o1.lop.compareTo(o2.lop);
            }
        });

        for(SinhVien i : m){
            System.out.println(i);
        }
    }
}
