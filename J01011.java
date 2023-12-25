package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static long gcd(long a, long b){
        long temp = 0;
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.printf("%d %d\n", (a/gcd(a, b)) * b, gcd(a, b));
            
        }
    }   
}
