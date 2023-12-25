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
    static int[] a = new int[1000006];
    
    static void tinh(){
        for(int i = 2; i <= 1000000; i++){
            for(int j = i * 2; j <= 1000000; j += i){
                a[j] += i;
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int b = sc.nextInt();
        int d = 0;
        tinh();
        
        for(int i = c; i <= b; i++){
            if(a[i] > i) d++;
        }
        System.out.println(d);
    }

}
