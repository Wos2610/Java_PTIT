package javaapplication1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JavaApplication1 {

    static class Khach{
        int t;
        int d;

        public Khach(int t, int d) {
            this.t = t;
            this.d = d;
        }
        
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Khach> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(new Khach(sc.nextInt(), sc.nextInt()));
        }
        
        Collections.sort(a, new Comparator<Khach>(){
            @Override
            public int compare(Khach o1, Khach o2) {
                return o1.t - o2.t;
            }
        });
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(sum < a.get(i).t){
                sum = a.get(i).t;
            }
            sum += a.get(i).d;
        }
        
        System.out.println(sum);
    }

}
