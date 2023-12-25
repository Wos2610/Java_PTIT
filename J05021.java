package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
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
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
//        int t = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String x = sc.nextLine();
            if("".equals(x)) break;
            list.add(new Student(x, sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(list, (Student o1, Student o2) -> {
            return o1.ma.compareTo(o2.ma);
        });
        
        for(Student i : list){
            System.out.println(i);
        }
    }
}
