package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {
    static class Student{
        String ma, name, clas;
        double x1, x2, x3;

        public Student(String ma, String name, String clas, double x1, double x2, double x3) {
            this.ma = ma;
            this.name = name;
            this.clas = clas;
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + clas + " " + String.format("%.1f", x1) + " " + String.format("%.1f", x2)+ " " + String.format("%.1f", x3);
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        
        Collections.sort(list, (Student o1, Student o2) -> o1.name.compareTo(o2.name));
        
        for(int i = 0; i < n; i++){
            System.out.print((i + 1) + " ");
            System.out.println(list.get(i));
        }
        
    }
    
}
