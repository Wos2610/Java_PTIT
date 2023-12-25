package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static long MOD = 1000000007;
    
    static long pow(long a, long b){
        if(b == 0) return 1;
        if(b % 2 == 0){
            long temp = pow(a, b/2);
            return (temp * temp) % MOD;
        }
        else{
            long temp = pow(a, b - 1);
            return (temp * a) % MOD;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) return;
            System.out.println(pow(a, b));
        }
    }   
}
