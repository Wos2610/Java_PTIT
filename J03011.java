package danhsachsinhvien1;

import java.io.*;
import java.math.BigInteger;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NewProject1 {
    static BigInteger gcd(BigInteger a, BigInteger b){
        while(!b.equals(BigInteger.ZERO)){
            BigInteger tmp = a.mod(b);
            a = b;
            b = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            System.out.println(gcd(a, b));
        }
    }
}


