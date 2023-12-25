package newproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class NewProject1 {
    
    static ArrayList<Long> fibos = new ArrayList<>();
    public static void fibonacci(){
        fibos.add(1L);
        fibos.add(1L);
        
        for(int i = 2; i <= 92; i++){
            fibos.add(fibos.get(i - 1) + fibos.get(i - 2));
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        fibonacci();
        while(T > 0){
            T--;
            int n = sc.nextInt();
            System.out.println(fibos.get(n - 1));
        }
    }   
}
