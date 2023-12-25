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

    private static class Name {
        String name, familyName, middleName, lastName;
        
        private void chuanHoaTen(){
            this.name = this.name.replaceAll("\\s+", " ").trim();
            String[] arr = this.name.split("\\s+");
            int n = arr.length;
            String res = "";
            for(int i = 0; i < n; i++){
                arr[i] = arr[i].toLowerCase();
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                res += arr[i];
                if(i >= 1 && i <= n - 2) this.middleName += arr[i] + " ";
                if(i != n - 1) res += " ";
            }
            this.familyName = arr[0];
//            this.middleName = arr[n - 2];
            this.lastName = arr[n - 1];
            this.name = res;
        }

        public Name(String name) {
            this.name = name;
            chuanHoaTen();
        }

        @Override
        public String toString() {
            return name;
        }
    }
        

    public static void main(String[] args) throws IOException {
        List<Name> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("DANHSACH.in"));
//        int n = Integer.parseInt(in.nextLine());
//        for (int i = 1; i <= n; i++) {
//            ds.add(new Subject(i, in.nextLine(), in.nextLine(), in.nextLine()));
//        }
        while(in.hasNext()){
            ds.add(new Name(in.nextLine()));
        }
        Collections.sort(ds, (Name o1, Name o2) -> {
            if(o1.lastName.compareTo(o2.lastName) == 0){
                if(o1.familyName.compareTo(o2.familyName) == 0) return o1.middleName.compareTo(o2.middleName);
                return o1.familyName.compareTo(o2.familyName);
            }
            return o1.lastName.compareTo(o2.lastName);
        });
        
        for(Name i : ds){
            System.out.println(i);
        }
    }

}
