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
    private static class Subject{
        String ma, name;
        int soTin;

        public Subject(String ma, String name, int soTin) {
            this.ma = ma;
            this.name = name;
            this.soTin = soTin;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + soTin;
        }
        
        
     
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        List<Subject> subjects = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Subject x = new Subject(sc.nextLine(), sc.nextLine(),  Integer.parseInt(sc.nextLine()));
            subjects.add(x);
        }
        
        Collections.sort(subjects, (Subject o1, Subject o2) -> o1.name.compareTo(o2.name));
        
        for(Subject i : subjects){
            System.out.println(i);
        }
    }
    
}
