package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    private static int[] m = new int[1000006];
    private static void sieve(){
        m[0] = m[1] = 1;
        for(int i = 2; i * i < 1000006; i++){
            if(m[i] == 0){
                for(int j = i * i; j < 1000006; j += i){
                    m[j] = i;
                }
            }
        }
    }
    
    static class Pair<T1, T2>{
        T1 a;
        T2 b;

        public Pair(T1 a, T2 b) {
            this.a = a;
            this.b = b;
        }
        
        public boolean check (int x){
            if(x < 2) return false;
            
            for(int i = 2; i * i <= x; i++){
                if(x % i == 0) return false;
            }
            return true;
        }
        
        public boolean isPrime(){
            return check((Integer) a) == true && check((Integer) b) == true;
        }

        @Override
        public String toString() {
            return a + " " + b;
        }
        
        
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    public static void main6307665(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    
}

