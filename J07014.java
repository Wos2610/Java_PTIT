package danhsachsinhvien1;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class NewProject1 {
    static class WordSet{
        Set<String> l = new TreeSet<>();

        public WordSet() {
        }

        
        public WordSet(String file) throws FileNotFoundException {
            Scanner sc = new Scanner(new File(file));
            while(sc.hasNext()){
                l.add(sc.next().toLowerCase());
            }
        }
        
        public WordSet union(WordSet a){
            WordSet res = new WordSet();
            
            for(String i : this.l) res.l.add(i);
            for(String i : a.l) res.l.add(i);
            
            return res;
        }
        
        public WordSet intersection(WordSet a){
            WordSet res = new WordSet();
            Set<String> tmp = new TreeSet<>(this.l);
            tmp.retainAll(a.l);
            res.l = tmp;
            return res;
        }

        @Override
        public String toString() {
            String res = "";
            for(String i : this.l){
                res += i + " ";
            }
            return res;
        }
        
        
    }

    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
    public static void main5629600(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

