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
    static class Player{
        String id, name, in, out;
        long hour, minu, sum;

        public Player(String id, String name, String in, String out) {
            this.id = id;
            this.name = name;
            this.in = in;
            this.out = out;
            
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime start = LocalTime.parse(in, formatter);
            LocalTime end = LocalTime.parse(out, formatter);
            this.sum = Duration.between(start, end).toMinutes();
            this.hour = this.sum/60;
            this.minu = this.sum - this.hour * 60;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + hour + " gio " + minu + " phut";
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Player> list = new ArrayList<>();
        while (t-- > 0) {
            Player x = new Player(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(x);
        }
        Collections.sort(list, (Player o1, Player o2) -> {
            return Long.compare(o2.sum, o1.sum);
        });
        for(Player i : list){
            System.out.println(i);
        }
    }
}
