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
    private static class Student{
        String msv, name, clas, mail;

        private String chuanHoa(String s){
            s = s.replaceAll("\\s+", " ").trim();
            String[] a = s.split("\\s+");
            
            String res = "";
            for(int i = 0; i < a.length; i++){
                a[i] = a[i].toLowerCase();
                a[i] = a[i].substring(0, 1).toUpperCase() + a[i].substring(1);
                res += a[i];
                if(i != a.length - 1) res += " ";
            }
            return res;
        }
        
        public Student(String msv, String name, String clas, String mail) {
            this.msv = msv;
            this.name = chuanHoa(name);
            this.clas = clas;
            this.mail = mail;
        }

        public String getMsv() {
            return msv;
        }

        public String getName() {
            return name;
        }

        public String getClas() {
            return clas;
        }

        public String getMail() {
            return mail;
        }

        @Override
        public String toString() {
            return msv + " " + name + " " + clas + " " + mail;
        }
     
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        
        List<Student> students = new ArrayList<>();
        for(int i = 0; i < n; i++){
            Student x = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            students.add(x);
        }
        
        Collections.sort(students, (Student o1, Student o2) -> o1.msv.compareTo(o2.msv));
        
        for(Student i : students){
            System.out.println(i);
        }
    }
    
}
