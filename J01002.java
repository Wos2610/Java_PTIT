package newproject1;

import java.util.Scanner;

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            long n = sc.nextLong();
            System.out.println((1 + n) * n / 2);
        }
    }   
}
