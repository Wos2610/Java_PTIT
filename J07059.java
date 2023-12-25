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
        int stt;
        String ma, time, room, date;
        LocalDateTime dateTime;

        public Subject(int stt, String date, String time, String room) {
            this.stt = stt;
            this.ma = String.format("C%03d", stt);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyyHH:mm");
            this.date = date;
            this.time = time;
            this.dateTime = LocalDateTime.parse(date + time, formatter);
            this.time = time;
            this.room = room;
        }

        @Override
        public String toString() {
            return ma + " " + date + " " + time + " " + room;
        }
    }
        

    public static void main(String[] args) throws IOException {
        List<Subject> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("CATHI.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Subject(i, in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        Collections.sort(ds, (Subject o1, Subject o2) -> {
            if(o1.dateTime.equals(o2.dateTime)) return o1.ma.compareTo(o2.ma);
            return o1.dateTime.compareTo(o2.dateTime);
        });
        
        for(Subject i : ds){
            System.out.println(i);
        }
    }

}
