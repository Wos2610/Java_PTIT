package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    private static class Product{
        String ma, name;
        int price, warranty;

        public Product(String ma, String name, int price, int warranty) {
            this.ma = ma;
            this.name = name;
            this.price = price;
            this.warranty = warranty;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + price + " " + warranty;
        }
    }
    
    public static void main(String[] args) throws IOException {
        List<Product> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++){
            ds.add(new Product(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine()), Integer.parseInt(in.nextLine())));
        }
        
        Collections.sort(ds, (Product o1, Product o2) -> {
            if(o1.price == o2.price){
                return o1.ma.compareTo(o2.ma);
            }
            return o2.price - o1.price;            
        });
        for(Product tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
