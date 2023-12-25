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
    public static void main(String[] args) throws FileNotFoundException {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), ok = 0;
            Long a[] = new Long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    ok = 1;
                    System.out.println(i);
                    break;
                }
            }
            if (ok == 0)
                System.out.println(0);
        }
        sc.close();
    }
}
