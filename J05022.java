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
            String lop = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s:\n", lop);
            for(Student j : list){
                if(j.clas.equals(lop)) System.out.println(j);
            }
        }
    }
    
}
