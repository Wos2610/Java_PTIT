package day2_bai1;
import java.util.*;

public class Motorbike extends Vehicle{
    double capacity;

    public Motorbike() {
    }

    
    public Motorbike(String id, String company, int year, double price, String color, double capacity) {
        super(id, company, year, price, color);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\t" + capacity + "\n";
    }
    
    public void input(){
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("\t Capacity : ");
        this.capacity = Double.parseDouble(input.nextLine());
    }
    
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
    
}
