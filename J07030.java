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
    
    private static void writeToFile(String fileName) throws FileNotFoundException, IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        List<Integer> b = new ArrayList<>();
        b.add(227);
        b.add(224);
        b.add(22643);
        oos.writeObject(b);
        oos.close();
    }
    
    
    private static List<Integer> dem(String fileName, List<Integer> save) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        List<Integer> a = (ArrayList<Integer>) ois.readObject();
       
        int[] d = new int[1000006];
        for(Integer i : a){
            if(m[i] == 0){
                if(save.contains(i) == false){
                    save.add(i);
                }
            }
        }
        ois.close();
        return save;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sieve();
       
        List<Integer> save1 = new ArrayList<>();
        List<Integer> save2 = new ArrayList<>();
        save1 = dem("DATA1.in", save1);
        save2 = dem("DATA2.in", save2);
        
        Collections.sort(save1);
        
        for(Integer i : save1){
            if(i >= 1000000 - i) break;
            if(save2.contains(1000000 - i) == true){
                System.out.println(i + " " + (1000000 - i));
            }
            
        }
    }
    
}
