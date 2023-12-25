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
    static boolean check(int n, List<Long> a){
        for(int j = 0; j < n - 1; j++){
                for(int l = j + 1; l < n; l++){
                    long x = a.get(j) * a.get(j) + a.get(l) * a.get(l);
                    long tmp = (int) Math.sqrt(x);
                    if(tmp * tmp == x){
                        if(a.contains(tmp)){
                            return true;
                        }
                    }
                }
            }
        return false;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            List<Long> a = new ArrayList<>();
            for(int j = 0; j < n; j++){
                a.add(sc.nextLong());
            }
            if(check(n, a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}
