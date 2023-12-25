package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {
    static class Student{
        String ma, name, clas, mail;

        public Student(String ma, String name, String clas, String mail) {
            this.ma = ma;
            this.name = name;
            this.clas = clas;
            this.mail = mail;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + clas + " " + mail;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= q; i++){
            String nganh = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", nganh.toUpperCase());
            String ng = "";
            if("Ke toan".equals(nganh)) ng = "KT";
            else if("Cong nghe thong tin".equals(nganh)) ng = "CN";
            else if("An toan thong tin".equals(nganh)) ng = "AT";
            else if("Vien thong".equals(nganh)) ng = "VT";
            else if("Dien tu".equals(nganh)) ng = "DT";
            for(Student j : list){
                if(j.ma.substring(5, 7).equals(ng)){
                    if("CN".equals(ng) || "AT".equals(ng)){
                        if(j.clas.charAt(0) != 'E') System.out.println(j);
                    }
                    else{
                        System.out.println(j);
                    }
                }
            }
        }
    }
    
}
