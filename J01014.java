package newproject1;

import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long sum = 0;
        while(T > 0){
            T--;
            long n = sc.nextLong();
            long res = 0;
            for(long i = 2; i * i <= n; i++){
                if(n % i == 0){
                    res = Math.max(res, i);
                    while(n % i == 0) n /= i;
                }
            }
            if(n > 1) res = n;
            System.out.println(res);
        }
        
    }   
}
