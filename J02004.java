package newproject1;

import java.util.Scanner;

public class NewProject1 {
    static int[] a = new int[106];
    static int n = 0;
    
    static boolean check(int[] a){
        for(int i = 0; i < n/2; i++){
            if(a[i] != a[n - i - 1]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            n = sc.nextInt();
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if(check(a) == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }   
}
