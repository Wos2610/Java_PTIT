package newproject1;

import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            int n = sc.nextInt();
            int d = 0;
            for(int i = 1; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    if(i % 2 == 0) d++;
                    if(n/i % 2 == 0 && i != n/i) d++;
                }
            }
            System.out.println(d);
        }
    }   
}
