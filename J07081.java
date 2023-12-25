package newproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {

    private static class Student {
        String ma, name, phone, mail, familyName, middleName, lastName;

        private void chuanHoaTen(){
            this.name = this.name.trim().replaceAll("\\s+", " ");
            String[] arr = this.name.split("\\s+");
            int n = arr.length;
            String res = "";
            for(int i = 0; i < n; i++){
                arr[i] = arr[i].toLowerCase();
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                if(i >= 1 && i <= n - 2) this.middleName += arr[i];
                res += arr[i];
                if(i != n - 1) res += " ";
            }
            this.familyName = arr[0];
            this.lastName = arr[n - 1];
            this.name = res;
        }
        
        public Student(String ma, String name, String phone, String mail) {
            this.ma = ma;
            this.name = name;
            chuanHoaTen();
            this.phone = phone;
            this.mail = mail;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + phone + " " + mail;
        }
    }
        

    public static void main(String[] args) throws IOException {
        List<Student> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            ds.add(new Student(in.nextLine(), in.nextLine(),in.nextLine(), in.nextLine()));
        }
        Collections.sort(ds, (Student o1, Student o2) -> {
            if(o1.lastName.equals(o2.lastName)){
                if(o1.familyName.equals(o2.familyName)){
                    if(o1.middleName.equals(o2.middleName)) return o1.ma.compareTo(o2.ma);
                    return o1.middleName.compareTo(o2.middleName);
                }
                return o1.familyName.compareTo(o2.familyName);
            }
            return o1.lastName.compareTo(o2.lastName);
        });
        
        for(Student i : ds){
            System.out.println(i);
        }
    }

}
