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
        int id;
        String ma, name, group;
        float buyPrice, sellPrice, profit;

        public Product(int id, String name, String group, float buyPrice, float sellPrice) {
            this.id = id;
            String tmp = String.valueOf(id);
            if(tmp.length() != 2) tmp = "0" + tmp;
            this.ma = "MH" + tmp;
            this.name = name;
            this.group = group;
            this.buyPrice = buyPrice;
            this.sellPrice = sellPrice;
            this.profit = sellPrice - buyPrice;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + group + " " + String.format("%.2f", profit);
        }
    }
    
    public static void main(String[] args) throws IOException {
        List<Product> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("MATHANG.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++){
            ds.add(new Product(i, in.nextLine(), in.nextLine(), Float.parseFloat(in.nextLine()), Float.parseFloat(in.nextLine())));
        }
        
        Collections.sort(ds, (Product o1, Product o2) -> {
            return (int)(o2.profit - o1.profit);            
        });
        for(Product tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
