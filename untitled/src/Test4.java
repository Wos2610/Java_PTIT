import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test4 {
    static List<String> save = new ArrayList<>();
    static int[] a = new int[10000];
    static void Try(int i, int n){
        if(i == n + 1){
            String res = "";
            for(int j = 1; j <= n; j++){
                if(a[j] == 0){
                    res += '4';
                }
                else{
                    res += '5';
                }
            }
            for(int j = n; j >= 1; j--){
                if(a[j] == 0){
                    res += '4';
                }
                else{
                    res += '5';
                }
            }
            save.add(res);
            return;
        }
        for(int j = 0; j <= 1; j++){
            a[i] = j;
            Try(i + 1, n);
        }
    }
    static void sinh(){
//        Try(1, 1);
        for(int i = 1; i <= 15; i++){
            Try(1, i);
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sinh();
        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            for(int j = 0; j < n; j++){
                System.out.print(save.get(j) + " ");
            }
            System.out.println();
        }
    }
}
