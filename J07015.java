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
    private static int[] m = new int[10007];
    private static void sieve(){
        m[0] = m[1] = 1;
        for(int i = 2; i * i <= 10006; i++){
            if(m[i] == 0){
                for(int j = i * i; j <= 10006; j += i){
                    m[j] = i;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SONGUYEN.in"));
//        List<Integer> b = new ArrayList<>();
//        b.add(11);
//        b.add(19);
//        b.add(2);
//        b.add(11);
//        b.add(1);
//        oos.writeObject(b);
//        oos.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        List<Integer> arr = (ArrayList<Integer>) ois.readObject();
        List<Integer> save = new ArrayList<>();
        
        int[] d = new int[10006];
        
        for(Integer i : arr){
            if(m[i] == 0){
                if(save.contains(i) == false){
                    save.add(i);
                }
                d[i]++;
            }
        }
        
        Collections.sort(save);
        for(Integer i : save){
            System.out.println(i + " " + d[i]);
        }
        ois.close();
    }
    
}
