package newproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    public static void change(String s){
        s = s.replaceAll("\\s+", " ").trim();
        String[] a = s.split(" ");
        
        for(String i : a){
            String tmp = i.toLowerCase();
            tmp = tmp.substring(0, 1).toUpperCase() + tmp.substring(1);
            System.out.print(tmp + " ");
        }
        
        System.out.println();
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.equals("END")) break;
            change(s);
        }
    }
}
