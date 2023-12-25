
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test23 {
    static class Product {
        String ma, name;
        long gia, bh;

        public Product(String ma, String name, long gia, long bh) {
            this.ma = ma;
            this.name = name;
            this.gia = gia;
            this.bh = bh;
        }
    }

    static class KhachHang{
        int id;
        String ma, name, diaChi;
        Product product;
        long soLuong, sum;
        String ngayMua;
        String ngayHetHan;
        LocalDate date;

        public KhachHang(int id, String name, String diaChi, Product product, long soLuong, String ngayMua) {
            this.id = id;
            this.ma = String.format("KH%02d", id);
            this.name = name;
            this.diaChi = diaChi;
            this.product = product;
            this.soLuong = soLuong;
            this.ngayMua = ngayMua;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate start = LocalDate.parse(ngayMua, formatter);
            this.date = start.plusMonths(product.bh);
            this.ngayHetHan = this.date.format(formatter);
            this.sum = this.soLuong * this.product.gia;
        }

        @Override
        public String toString() {
            return this.ma + " " + this.name + " " + this.diaChi + " " + this.product.ma + " " + this.sum + " " + this.ngayHetHan;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        List<Product> p = new ArrayList<>();
        List<KhachHang> m = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            p.add(new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        int k = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= k; i++){
            String name = sc.nextLine();
            String diaChi = sc.nextLine();
            String ma = sc.nextLine();
            Product sp = null;
            for(int j = 0; j < n; j++){
                if(p.get(j).ma.equals(ma)){
                    sp = p.get(j);
                    break;
                }
            }
           m.add(new KhachHang(i, name, diaChi, sp, Long.parseLong(sc.nextLine()), sc.nextLine()));
        }

        Collections.sort(m, new Comparator<KhachHang>() {
            @Override
            public int compare(KhachHang o1, KhachHang o2) {
                if(o1.date.equals(o2.date)){
                    return o1.ma.compareTo(o2.ma);
                }
                return o1.date.compareTo(o2.date);
            }
        });
        for(KhachHang i : m){
            System.out.println(i);
        }
    }
}
