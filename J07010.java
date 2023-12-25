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
    
    private static class Student{
        int id;
        String msv, name, date, clas;
        double gpa;

        public Student(int id, String name, String clas, String date, double gpa) {
            this.id = id;
            String tmp = String.valueOf(id);
            while(tmp.length() != 3) tmp = "0" + tmp;
            this.msv = "B20DCCN" + tmp;
            this.name = name;
            if(date.charAt(1) == '/') date = "0" + date;
            if(date.charAt(4) == '/') date = date.substring(0, 3) + "0" + date.substring(3);
            this.date = date;
            this.clas = clas;
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return msv + " " + name + " " + clas + " " + date + " " + String.format("%.2f", gpa);
        }
        
        
        
        
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            Student x = new Student(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()));
            System.out.println(x.toString());
        }
    }
    
}
