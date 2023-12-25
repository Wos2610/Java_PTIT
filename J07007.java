package newproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    static class WordSet {
        String fileName;
        List<String> save = new ArrayList<>();
        public WordSet(String fileName) throws FileNotFoundException{
            this.fileName = fileName;
            Scanner sc = new Scanner(new File(fileName));
            while(sc.hasNext()){
                String x = sc.next().toLowerCase();
                if(!save.contains(x)){
                    save.add(x);
                }
            }
            Collections.sort(save);
        }

        @Override
        public String toString() {
            String res = "";
            for(String i : save){
                res += i + '\n';
            }
            return res;
        }
    }
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main8626518(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    
}

