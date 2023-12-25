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

    public static class Complex{
        long thuc, ao;

        public Complex(long thuc, long ao) {
            this.thuc = thuc;
            this.ao = ao;
        }

        public Complex cong(Complex a){
            Complex x = new Complex(0, 0);
            x.thuc = this.thuc + a.thuc;
            x.ao = this.ao + a.ao;
            return x;
        }
        
        public Complex nhan(Complex a){
            Complex x = new Complex(0, 0);
            x.thuc = this.thuc * a.thuc - this.ao * a.ao;
            x.ao = this.thuc * a.ao + this.ao * a.thuc;
            return x;
        }

        @Override
        public String toString() {
            return thuc + " + " + ao + "i";
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
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            Complex a = new Complex(sc.nextLong(), sc.nextLong());
            Complex b = new Complex(sc.nextLong(), sc.nextLong());
            Complex tmp = a.cong(b);
            Complex c = tmp.nhan(a);
            Complex d = tmp.nhan(tmp);
            System.out.println(c + ", " + d);
            
        }
    }

}
