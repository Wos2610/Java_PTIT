package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static boolean isPrime(long a){
        if(a < 2) return false;
        
        for(long i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            long n = sc.nextLong();
            if(isPrime(n) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
