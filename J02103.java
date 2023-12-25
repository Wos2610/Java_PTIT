package newproject1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class NewProject1 {

    private static long[][] a;

    private static void tich(long[][] a, int n, int m) {
        long[][] b = new long[m + 6][n + 6];
        long[][] c = new long[n + 6][n + 6];

        for (int j = 1; j <= m; j++) {
            for (int k = 1; k <= n; k++) {
                b[j][k] = a[k][j];
            }
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                c[i][j] = 0;
                for(int k = 1; k <= m; k++){
                    c[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            System.out.printf("Test %d:\n", i);
            int n = sc.nextInt();
            int m = sc.nextInt();
            a = new long[n + 6][m + 6];

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= m; k++) {
                    a[j][k] = sc.nextInt();
                }
            }

            tich(a, n, m);
        }
    }
}
