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

    public static class Fraction{
        long tu, mau;

        public Fraction(long tu, long mau) {
            this.tu = tu;
            this.mau = mau;
        }
        
        public Fraction cong(Fraction a){
            Fraction sum = new Fraction(0, 1);
            sum.mau = this.mau * a.mau;
            sum.tu = this.tu * a.mau + this.mau * a.tu;
            return sum;
        }
        
        public Fraction nhan(Fraction a){
            Fraction sum = new Fraction(0, 1);
            sum.mau = this.mau * a.mau;
            sum.tu = this.tu * a.tu;
            return sum;
        }
        
        public static long gcd(long a, long b){
            while(b != 0){
                long tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }
        public Fraction rutGon(){
            long k = gcd(this.tu, this.mau);
            Fraction x = new Fraction(this.tu, this.mau);
            x.tu = x.tu / k;
            x.mau = x.mau / k;
            return x;
        }

        @Override
        public String toString() {
            return tu + "/" + mau;
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
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction tmp = a.cong(b);
            Fraction c = tmp.nhan(tmp).rutGon();
            Fraction d = a.nhan(b).nhan(c).rutGon();
            System.out.println(c + " " + d);
            
        }
    }

}
