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

        String name, date;
        long age;

        public Student(String name, String date) {
            this.name = name;
            this.date = date;

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate x1 = LocalDate.parse(date, dtf);
            LocalDate x2 = LocalDate.now();
            this.age = ChronoUnit.DAYS.between(x1, x2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(new Student(sc.next(), sc.next()));
        }

        Collections.sort(list, (Student o1, Student o2) -> Long.compare(o1.age, o2.age));

        System.out.println(list.get(0).name);
        System.out.println(list.get(n - 1).name);
    }

}
