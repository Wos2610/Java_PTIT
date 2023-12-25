package newproject1;

import java.util.Scanner;

class Student{
    private String MSV;
    private String name;
    private String clas;
    private String date;
    private double sum;
    
    
    public Student() {
    }

    public Student(String MSV, String name, String clas, String date, double sum) {
        this.MSV = MSV;
        this.name = name;
        this.clas = clas;
        this.date = Student.checkDate(date);
        this.sum = sum;
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

    public String getClas() {
        return clas;
    }

    public String getDate() {
        return date;
    }

    public double getSum() {
        return sum;
    }

    
    

    
}

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            Student a = new Student("B20DCCN001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.printf("%s %s %s %s %.2f\n", a.getMSV(), a.getName(),a.getClas(), a.getDate(), a.getSum());
        }
    }
}
