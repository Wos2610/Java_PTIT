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
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {

    private static class Subject {
        String ma, name, type;

        public Subject(String ma, String name, String type) {
            this.ma = ma;
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + type;
        }
    }
        

    public static void main(String[] args) throws IOException {
        List<Subject> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Subject(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        Collections.sort(ds, (Subject o1, Subject o2) -> {
            return o1.ma.compareTo(o2.ma);
        });
        
        for(Subject i : ds){
            System.out.println(i);
        }
    }

}
