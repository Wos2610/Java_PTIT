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

    public static class Student{
        String ma, name, status;
        double x1, x2, x3, bonus, sum;
       
        private void tinhDiem(){
            String kv = ma.substring(0, 3);
            switch (kv) {
                case "KV1":
                    this.bonus = 0.5;
                    break;
                case "KV2":
                    this.bonus = 1.0;
                    break;
                case "KV3":
                    this.bonus = 2.5;
                    break;
                default:
                    break;
            }
            
            this.sum = this.x1 * 2 + this.x2 + this.x3;
            if(this.sum + this.bonus >= 24){
                this.status = "TRUNG TUYEN";
            }
            else{
                this.status = "TRUOT";
            }
        }

        public Student(String ma, String name, double x1, double x2, double x3) {
            this.ma = ma;
            this.name = name;
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            tinhDiem();
        }
        
        

        @Override
        public String toString() {
            return this.ma + " " + this.name + " " + NumberFormat.getInstance().format(this.bonus) + " " + NumberFormat.getInstance().format(this.sum) + " " + this.status;
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
            Student x = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            System.out.println(x);
        }
    }

}
