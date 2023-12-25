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
            int n = sc.nextInt();
            int[] a = new int[n+1];
            a[0] = 1000000000;
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for (int i = 1; i <= n; i++) {
                while (!st.isEmpty() && a[st.peek()] <= a[i]) {
                    st.pop();
                }
                System.out.print(i - st.peek() + " ");
                st.push(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
