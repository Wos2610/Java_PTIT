package newproject1;

import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        
        long[] a = new long[26];
        a[0] = 1;
        for(int i = 1; i <= 20; i++){
            a[i] = a[i - 1] * i;
        }
        
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            int n = sc.nextInt();
            long sum = 0;
            for(int i = 1; i <= n; i++){
                sum += a[i];
            }
            System.out.println(sum);
        }
    }   
}
