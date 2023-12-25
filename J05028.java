package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaApplication1 {
    static class Company{
        String ma, name;
        int number;

        public Company(String ma, String name, int number) {
            this.ma = ma;
            this.name = name;
            this.number = number;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + number;
        }

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Company> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine())));
        }
        
        Collections.sort(list, new Comparator<Company>(){
            @Override
            public int compare(Company o1, Company o2) {
                if(o1.number == o2.number) return o1.ma.compareTo(o2.ma);
                return o2.number - o1.number;
            }
        });
        
        for(Company j : list){
            System.out.println(j);
        }
        
    }
    
}
