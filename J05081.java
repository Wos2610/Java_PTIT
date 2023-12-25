package newproject1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

class Product {

    private int index, mua, ban, lai;
    private String ma, name, dv;

    public Product(int index, String name, String dv, int mua, int ban) {
        this.index = index;
        String tmp = String.valueOf(index);
        while(tmp.length() != 3) tmp = "0" + tmp;
        this.ma = "MH" + tmp;
        this.mua = mua;
        this.ban = ban;
        this.lai = ban - mua;
        this.name = name;
        this.dv = dv;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getMua() {
        return mua;
    }

    public void setMua(int mua) {
        this.mua = mua;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getLai() {
        return lai;
    }

    public void setLai(int lai) {
        this.lai = lai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }
    
    
    
}

public class NewProject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while (T > 0) {
            T--;
            int n = Integer.parseInt(sc.nextLine());
            List<Product> products = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                products.add(new Product(i + 1, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
            }
            
            Collections.sort(products, (Product o1, Product o2) -> {
                if (o1.getLai() == o2.getLai()) {
                    return o1.getMa().compareTo(o2.getMa());
                }
                return o2.getLai() - o1.getLai();
            });
            for (Product i : products) {
                System.out.printf("%s %s %s %d %d %d\n", i.getMa(), i.getName(), i.getDv(), i.getMua(), i.getBan(), i.getLai());
            }
        }
    }
}
