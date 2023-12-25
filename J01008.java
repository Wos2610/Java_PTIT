package newproject1;

import java.util.HashMap;
import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int T1 = T;
        while(T > 0){
            T--;
            int n = sc.nextInt();
            
            System.out.printf("Test %d: ",(T1 - T));
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    int dem = 0;
                    while(n % i == 0){
                        dem++;
                        n /= i;
                    }
                    System.out.printf("%d(%d) ", i, dem);
                }
                if(n == 0) break;
            }
            
            if(n > 1) System.out.printf("%d(%d) ", n, 1);
            
            System.out.println();
        }
    }   
}
