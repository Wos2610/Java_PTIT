package newproject1;

import java.util.Scanner;

public class NewProject1 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            double n = sc.nextLong();
            double h = sc.nextLong();
            for(int i = 1; i < n; i++){
                System.out.printf("%.6f ", Math.sqrt(i / n) * h);
            }
            System.out.println();
        }
    }   
}
