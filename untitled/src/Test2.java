import java.io.IOException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 6][n + 6];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        double k = sc.nextInt();

        int sum1 = 0;
        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                sum1 += a[i][j];
            }
        }

        int sum2 = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i - 1; j++){
                sum2 += a[i][j];
            }
        }

        double x = Math.sqrt((double) (Math.abs(sum1 - sum2)));
        if(Double.compare(x, k) <= 0) System.out.println("YES");
        else System.out.println("NO");
        System.out.println(String.format("%.5f", x));
    }
}
