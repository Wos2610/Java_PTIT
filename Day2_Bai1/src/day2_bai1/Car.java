package day2_bai1;
import java.util.*;

public class Car extends Vehicle{
    String engineType;
    int seatNumber;

    public Car() {
    }

    public Car(String id, String company, int year, double price, String color, String engineType, int seatNumber) {
        super(id, company, year, price, color);
        this.engineType = engineType;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + engineType + "\t" + seatNumber + "\n"; 
    }
    
    public void input(){
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("\t Type of engine : ");
        this.engineType = input.nextLine();
        System.out.print("\t Number of seats : ");
        this.seatNumber = Integer.parseInt(input.nextLine());
    }
    
    
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    
}
