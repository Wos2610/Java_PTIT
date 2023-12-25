package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    
    private static boolean check(Integer x){
        String s = String.valueOf(x);
        int n = s.length();
        if(n <= 1) return false;
        if(n % 2 == 0) return false;
        
        for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt("" + s.charAt(i));
            if(tmp % 2 == 0) return false;
        }
        
        for(int i = 0; i <= n/2; i++){
            if(s.charAt(i) != s.charAt(n - i - 1)) return false;
        }
        return true;
    } 
    
    private static void writeToFile(String fileName, Integer x, Integer y, Integer z) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        List<Integer> b = new ArrayList<>();
        b.add(x);
        b.add(y);
        b.add(z);
        oos.writeObject(b);
        oos.close();
    }
    
    
    private static List<Integer> dem(String fileName, List<Integer> save, int[] d) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        List<Integer> a = (ArrayList<Integer>) ois.readObject();
       
        for(Integer i : a){
            if(check(i) == true){
                if(save.contains(i) == false){
                    save.add(i);
                }
                d[i] ++;
            }
        }
        ois.close();
        return save;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeToFile("DATA1.in", 939, 212, 123);
//        writeToFile("DATA2.in", 939, 99, 12);
        List<Integer> save1 = new ArrayList<>();
        List<Integer> save2 = new ArrayList<>();
        int[] d1 = new int[1000006];
        int[] d2 = new int[1000006];
        save1 = dem("DATA1.in", save1, d1);
        save2 = dem("DATA2.in", save2, d2);
        
        Collections.sort(save1);
        
        int dem = 0;
        for(Integer i : save1){
            if(save2.contains(i) == true){
                System.out.println(i + " " + (d1[i] + d2[i]));
                dem++;
            }
            if(dem == 10) break;
        }
    }
    
}
