package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    private static class LoaiPhong implements Comparable<LoaiPhong>{
        String type, name;
        int price;
        double bonus;

        public LoaiPhong(String s) {
            String[] arr = s.split("\\s+");
            this.type = arr[0];
            this.name = arr[1];
            this.price = Integer.parseInt(arr[2]);
            this.bonus = Double.parseDouble(arr[3]);
        }

        @Override
        public int compareTo(LoaiPhong o) {
            return this.name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return type + " " + name + " " + price + " " + bonus;
        }
        
        
        
        
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    public static void main9813644(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
    
}

