package newproject1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class NewProject1 {
    
    static ArrayList<Long> fibos = new ArrayList<>();
    static HashMap<Long, Integer> mp = new HashMap<>();
    
    
    public static void fibonacci(){
        fibos.add(1L);
        fibos.add(1L);
        mp.put(0L, 1);
        mp.put(1L, 1);
        for(int i = 2; i <= 92; i++){
            fibos.add(fibos.get(i - 1) + fibos.get(i - 2));
            mp.put(fibos.get(i - 1) + fibos.get(i - 2), 1);
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        fibonacci();
        while(T > 0){
            T--;
            Long n = sc.nextLong();
            if(mp.containsKey(n) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
