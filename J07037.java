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
    private static class Company{
        String ma, name;
        int num;

        public Company(String ma, String name, int num) {
            this.ma = ma;
            this.name = name;
            this.num = num;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + num;
        }
        
        
     
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        List<Company> companys = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Company x = new Company(sc.nextLine(), sc.nextLine(),  Integer.parseInt(sc.nextLine()));
            companys.add(x);
        }
        
        Collections.sort(companys, (Company o1, Company o2) -> o1.ma.compareTo(o2.ma));
        
        for(Company i : companys){
            System.out.println(i);
        }
    }
    
}
