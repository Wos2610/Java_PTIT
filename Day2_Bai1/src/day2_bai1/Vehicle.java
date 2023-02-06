package day2_bai1;
import java.util.*;

public class Vehicle {
    String id;
    String company;
    double year;
    double price;
    String color;

    public Vehicle() {
    }

    public Vehicle(String id, String company, double year, double price, String color) {
        this.id = id;
        this.company = company;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "\t" + id + "\t" + company + "\t\t" + year + "\t\t" + price + "\t" + color + "\t"; 
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter :");
        System.out.print("\t ID : ");
        this.id = input.nextLine();
        System.out.print("\t Company : ");
        this.company = input.nextLine();
        System.out.print("\t Manufacture year : ");
        this.year = Double.parseDouble(input.nextLine());
        System.out.print("\t Price : ");
        this.price = Double.parseDouble(input.nextLine());
        System.out.print("\t Color : ");
        this.color = input.nextLine();
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
