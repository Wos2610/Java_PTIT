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

class Salary{
    private long coBan, phuCap;
    private int heSo;
    private String name;

    public Salary(int heSo, long phuCap, String name, long coBan) {
        this.coBan = coBan;
        this.heSo = heSo;
        this.phuCap = phuCap;
        this.name = name;
    }

    public long tinhLuong(){
        return (coBan * heSo + phuCap);
    }

    public long getCoBan() {
        return coBan;
    }

    public long getPhuCap() {
        return phuCap;
    }

    public int getHeSo() {
        return heSo;
    }

    public String getName() {
        return name;
    }
    
    
    
}

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            String s = sc.nextLine();
            int k = Integer.parseInt(s.substring(2, 4));
            long phuCap = 0;
            String chucVu = s.substring(0, 2);
            switch(chucVu){
                case "HT":
                   phuCap = 2000000;
                   break;
                case "HP":
                   phuCap = 900000;
                   break;
                case "GV":
                   phuCap = 500000;
                   break;
            }
                    
            Salary x = new Salary(k, phuCap, sc.nextLine(), sc.nextLong());
            System.out.printf("%s %s %d %d %d\n", s, x.getName(), x.getHeSo(), x.getPhuCap(), x.tinhLuong());
        }
    }
}
