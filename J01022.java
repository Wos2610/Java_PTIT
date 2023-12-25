package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static long[] l = new long[96];
    
    static long find(int n, long k){
        if(n == 1) return 0L;
        if(n == 2) return 1L;
        if(k <= l[n - 2]) return find(n - 2, k);
        return find(n - 1, k - l[n - 2]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        l[1] = l[2] = 1;
        for(int i = 3; i < 93; i++){
            l[i] = l[i - 1] + l[i - 2];
        }
        
        int T = sc.nextInt();
        while(T > 0){
            T--;
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find(n, k));
        }
    }   
}
