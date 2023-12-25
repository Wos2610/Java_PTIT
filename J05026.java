package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {
    static class Teacher{
        String ma, name, subject, ten;
        int id;

        public Teacher(int id, String name, String subject) {
            this.name = name;
            String[] splits = name.split("\\s+");
            this.ten = splits[splits.length - 1];
            String[] subjects = subject.toUpperCase().split("\\s+");
            this.subject = "";
            for(String i : subjects){
                this.subject += i.charAt(0);
            }
            this.id = id;
            this.ma = String.format("GV%02d", id);
        }

        @Override
        public String toString() {
            return   ma + " " + name + " " + subject;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Teacher> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(new Teacher(i, sc.nextLine(), sc.nextLine()));
        }
        int q = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= q; i++){
            String mon = sc.nextLine().toUpperCase();
            String[] tmp = mon.split("\\s+");
            String res = "";
            for(String j : tmp) res += j.charAt(0);
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", res);
            for(Teacher j : list){
                if(j.subject.equals(res)) System.out.println(j);
            }
        }
        
        
    }
    
}
