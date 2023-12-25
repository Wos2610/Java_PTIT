package newproject1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T > 0) {
            T -= 1;
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            Map<Long, Integer> m = new HashMap<>();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                m.put(a[i], m.containsKey(a[i]) ? m.get(a[i]) + 1 : 1);
            }
            
            long res = 0;
            for(Long i : a){
                long tmp = k - i;
                if(m.containsKey(tmp)){
                    if(tmp != i) res += m.get(tmp);
                    else res += (m.get(tmp) - 1);
                }
                //System.out.println(tmp + " " + m.get(tmp));
            }
            System.out.println(res/2);
        }
    }
}
