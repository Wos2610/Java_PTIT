package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    private static class Client implements Comparable<Client> {
        int id;
        String ma, name, room, arriveDate, leaveDate;
        long day;

        private long tinh(String arriveDate, String leaveDate){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date1 = LocalDate.parse(arriveDate, dtf);
            LocalDate date2 = LocalDate.parse(leaveDate, dtf);
            
            long dif = ChronoUnit.DAYS.between(date1, date2);
            return dif;
        }
        
        public Client(int id, String name, String room, String arriveDate, String leaveDate) {
            this.id = id;
            String tmp = String.valueOf(id);
            if(tmp.length() != 2) tmp = "0" + tmp;
            this.ma = "KH" + tmp;
            this.name = name;
            this.room = room;
            this.arriveDate = arriveDate;
            this.leaveDate = leaveDate;
            this.day = tinh(arriveDate, leaveDate);
        }

        @Override
        public int compareTo(Client o) {
            return (int) (o.day - this.day);
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + room + " " + day;
        }
    }
    
    public static void main(String[] args) throws IOException {
        List<Client> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1; i <= n; i++){
            ds.add(new Client(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
        }
        
        Collections.sort(ds);
        for(Client tmp : ds){
            System.out.println(tmp);
        }
    }
    
}
