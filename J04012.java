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

    public static class Worker{
        int stt;
        String ma, name, position;
        long basic_salary, days, sum, reward, bonus;
       
        private void tinhLuong(){
            this.basic_salary = this.basic_salary * this.days;
            if(this.days >= 25){
                this.reward = this.basic_salary * 20 / 100;
            }
            else if(this.days >= 22){
                this.reward = this.basic_salary * 10 / 100;
            }
            else{
                this.reward = 0;
            }
            
            switch (this.position) {
                case "GD":
                    this.bonus = 250000;
                    break;
                case "PGD":
                    this.bonus = 200000;
                    break;
                case "TP":
                    this.bonus = 180000;
                    break;
                case "NV":
                    this.bonus = 150000;
                    break;
                default:
                    break;
            }
            
            this.sum = this.basic_salary + this.reward + this.bonus;
        }
        
        public Worker(int stt, String name, long basic_salary, long days, String position) {
            this.stt = stt;
            this.ma = String.format("NV%02d", stt);
            this.name = name;
            this.position = position;
            this.basic_salary = basic_salary;
            this.days = days;
            tinhLuong();
        }

        @Override
        public String toString() {
            return this.ma + " " + this.name + " " + this.basic_salary + " " + this.reward + " " + this.bonus + " " + this.sum;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SONGUYEN.in"));
//        List<Integer> b = new ArrayList<>();
//        b.add(11);
//        b.add(19);
//        b.add(2);
//        b.add(11);
//        b.add(1);
//        oos.writeObject(b);
//        oos.close();
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
//        List<Integer> arr = (ArrayList<Integer>) ois.readObject();

        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            Worker x = new Worker(1, sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            System.out.println(x);
        }
    }

}
