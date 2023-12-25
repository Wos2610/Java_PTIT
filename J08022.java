package newproject1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int[] a = new int[100006];
        int[] b = new int[100006];
        while (T > 0) {
            T -= 1;
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < 100006; i++){
                b[i] = -1;
            }
            Stack<Integer> st = new Stack<>();
            
            for(int i = 1; i <= n; i++){
                while(!st.isEmpty() && a[st.peek()] < a[i]){
                    b[st.peek()] = i;
                    st.pop();
                }
                st.push(i);
            }
            
            for(int i = 1; i <= n; i++){
                if(b[i] == -1) System.out.print("-1 ");
                else System.out.print(a[b[i]] + " ");
            }
            System.out.println();
        }
    }
}
