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

    public static class Point{
        double x1, y1, x2, y2, canh;

        public Point(double x1, double y1, double x2, double y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.canh = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
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
        int t = sc.nextInt();
        while (t-- > 0) {
            double[] a = new double[10];
            for(int i = 1; i <= 6; i++){
                a[i] = sc.nextDouble();
            }
            
            double x = new Point(a[1], a[2], a[3], a[4]).canh;
            double y = new Point(a[3], a[4], a[5], a[6]).canh;
            double z = new Point(a[5], a[6], a[1], a[2]).canh;
//            System.out.println(x + " " + y + " " + z);
            if(x + y > z && x + z > y && y + z > x){
                double res = Math.sqrt((x + y + z) * (y + x - z) * (y - x + z) * (-y + x + z)) / 4;
                System.out.printf("%.2f\n", res);
            }
            else{
                System.out.println("INVALID");
            }
            
        }
    }

}
