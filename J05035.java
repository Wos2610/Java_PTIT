package javaapplication1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {

    static class Student {
        int stt;
        String ma, name, clas, mail, company;

        public Student(int stt, String ma, String name, String clas, String mail, String company) {
            this.stt = stt;
            this.ma = ma;
            this.name = name;
            this.clas = clas;
            this.mail = mail;
            this.company = company;
        }

        @Override
        public String toString() {
            return stt + " " + ma + " " + name + " " + clas + " " + mail + " " + company;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Collections.sort(list, (Student o1, Student o2) -> o1.ma.compareTo(o2.ma));

        int q = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= q; i++){
            String cty = sc.nextLine();
            for(Student j : list){
                if(j.company.equals(cty)) System.out.println(j);
            }
        }
    }

}
