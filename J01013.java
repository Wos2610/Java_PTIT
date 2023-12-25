package newproject1;

import java.util.Scanner;

public class NewProject1 {
    
    static long[] m = new long[2000006];
    static void sieve(){
        m[0] = m[1] = 1;
        for(int i = 2; i * i <= 2000000; i++){
            if(m[i] == 0){
                for(int j = i * i; j <= 2000000; j += i){
                    m[j] = i;
                }
            }
        }
        
        for(int j = 2; j <= 2000000; j++){
            if(m[j] == 0) m[j] = j;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sieve();
        long sum = 0;
        while(T > 0){
            T--;
            int n = sc.nextInt();
            while(n > 1){
                sum += m[n];
                n /= m[n];
            }
        }
        System.out.println(sum);
    }   
}
