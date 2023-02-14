package day3_bai1;

import java.util.*;
import java.io.*;

public class Product {
    static private int id = 0;
    private String pId;
    private String name;
    private String group;
    private double price;

    public Product() {
        id++;
        pId = String.valueOf(id);
        while(pId.length() < 4){
            pId = "0" + pId;
        }
    }

    public Product(String name, String group, double price) {
        this.name = name;
        this.group = group;
        this.price = price;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Product.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void input() throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        this.name = input.nextLine();
        System.out.print("Nhom hang (1. Thoi trang \t2. Tieu dung \t3. Dien may \t4. Gia dung): ");
        int c = Integer.parseInt(input.nextLine());
        switch(c){
            case 1: {
                this.group = "Hang thoi trang";
                break;
            }
            case 2: {
                this.group = "Hang tieu dung";
                break;
            }
            case 3: {
                this.group = "Hang dien may";
                break;
            }
            case 4: {
                this.group = "Hang gia dung";
                break;
            }
        }
        System.out.print("Gia san pham: ");
        this.price = Double.parseDouble(input.nextLine());
        
        try {
            FileWriter w = new FileWriter("MH.txt");
            w.write(this.toString());
            w.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Success...");
        
    }

    @Override
    public String toString() {
        return this.pId + "\t" + this.name + "\t" + this.group + "\t" + this.price;
    }
        
}
