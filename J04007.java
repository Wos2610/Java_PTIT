package newproject1;

import java.util.Scanner;

class Student{
    private String MSV;
    private String name;
    private String gender;
    private String date;
    private String address;
    private String maSoThue;
    private String contractDate;
    
    
    public Student() {
    }

    public Student(String MSV, String name, String gender, String date, String address, String maSoThue, String contractDate) {
        this.MSV = MSV;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
        this.maSoThue = maSoThue;
        this.contractDate = contractDate;
    }

    public static String checkDate(String s){
        if(s.charAt(1) == '/') s = "0" + s;
        if(s.charAt(4) == '/') s = s.substring(0, 3) + "0" + s.substring(3);
        return s;
    }

    public String getMSV() {
        return MSV;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public String getContractDate() {
        return contractDate;
    }
    
    
}

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            Student a = new Student("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            System.out.printf("%s %s %s %s %s %s %s\n", a.getMSV(), a.getName(),a.getGender(), a.getDate(), a.getAddress(), a.getMaSoThue(), a.getContractDate());
        }
    }
}
