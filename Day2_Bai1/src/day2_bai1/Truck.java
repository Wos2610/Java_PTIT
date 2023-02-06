package day2_bai1;
import java.util.*;

public class Truck extends Vehicle{
    double weight;

    public Truck() {
    }

    public Truck(String id, String company, int year, double price, String color, double weight) {
        super(id, company, year, price, color);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + weight + "\n"; 
    }

    public void input(){
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("\t Weight : ");
        this.weight = Double.parseDouble(input.nextLine());
    }  
    
    
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
}
