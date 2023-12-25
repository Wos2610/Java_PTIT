package newproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        List<String> save = new ArrayList<>();
        while(sc.hasNext()){
            String x = sc.next();
            try{
                int y = Integer.parseInt(x);
            }
            catch(NumberFormatException e){
                save.add(x);
            }
        }
        Collections.sort(save);
        for(String i : save){
            System.out.print(i + " ");
        }
    }
}
