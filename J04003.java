package newproject1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

class Fraction{
    private long tu;
    private long mau;

    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public long getTu() {
        return tu;
    }

    public long getMau() {
        return mau;
    }
    
    public void rutgon(long k){
        this.tu /= k;
        this.mau /= k;
    }
}


public class NewProject1 {
    private static long gcd(long a, long b){
        while(b != 0){
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            Fraction p = new Fraction(sc.nextLong(), sc.nextLong());
            p.rutgon(gcd(p.getTu(), p.getMau()));
            
            System.out.printf("%d/%d\n", p.getTu(), p.getMau());
            
            
        }
    }
}
