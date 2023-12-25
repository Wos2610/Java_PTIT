import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test21 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> s = new TreeSet<>();
        while(sc.hasNext()){
            String tmp = sc.next();
            int m = 0;
            for(int i = 0; i < tmp.length(); i++){
                if(tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9'){
                    m = 1;
                }
            }
            if(m == 0){
                s.add(tmp);
            }
        }
        for(String i : s){
            System.out.println(i);
        }
    }
}
