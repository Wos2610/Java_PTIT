package newproject1;

import java.util.Scanner;

class Student{
    private String name;
    private String date;
    private double x1;
    private double x2;
    private double x3;
    private double sum;
    
    
    public Student() {
    }

    public Student(String name, String date, double x1, double x2, double x3) {
        this.name = name;
        this.date = date;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.sum = x1 + x2 + x3;
    }

    public String getName() {
        return name;
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
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            System.out.printf("%s %s %.1f\n", a.getName(), a.getDate(), a.getSum());
        }
    }
}
