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
    private static int[] m = new int[1000006];
    private static void sieve(){
        m[0] = m[1] = 1;
        for(int i = 2; i * i < 1000006; i++){
            if(m[i] == 0){
                for(int j = i * i; j < 1000006; j += i){
                    m[j] = i;
                }
            }
        }
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        List<Integer> b = new ArrayList<>();
//        b.add(997);
//        b.add(3);
//        b.add(6);
//        b.add(7);
//        b.add(11);
//        b.add(29);
//        b.add(33);
//        b.add(53);
//        b.add(47);
//        b.add(31);
//        b.add(67);
//        b.add(61);
//        oos.writeObject(b);
//        oos.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<Integer> a = (ArrayList<Integer>) ois.readObject();
        List<Integer> save = new ArrayList<>();
        
        int[] d = new int[1000006];
        for(Integer i : a){
            if(m[i] == 0){
                if(save.contains(i) == false){
                    save.add(i);
                }
                d[i]++;
            }
        }
        
        Collections.sort(save, Collections.reverseOrder());
        
        for(int i = 0; i < 10; i++){
            System.out.println(save.get(i) + " " + d[save.get(i)]);
        }
        ois.close();
    }
    
}
