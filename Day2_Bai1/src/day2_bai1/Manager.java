package day2_bai1;

import java.util.*;

public class Manager {
    private Vehicle[] vehicles;
    private int n;
    private int motorNumber;
    private int truckNumber;
    private int carNumber;

    public Manager() {
        vehicles = new Vehicle[100];
        n = 0;
    }

    public int getNumberOfVehicle() {
        return n;
    }

    public void setNumberOfVehicle(int n) {
        this.n = n;
    }
    
    public void addNew(){
        System.out.print("How many vehicles do you want to add : ");
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        while(number-- > 0){
            System.out.println("There are 3 types of vehicle : \n \t1. Motorbike \t2. Truck \t3. Car");
            System.out.println("-> Your choice : ");
            int c = Integer.parseInt(input.nextLine());
            switch(c){
                case 1 -> {
                    vehicles[n] = new Motorbike();
                    vehicles[n].input();
                    n++;
                    break;
                }
                
                case 2 -> {
                    vehicles[n] = new Truck();
                    vehicles[n].input();
                    n++;
                    break;
                }
                
                case 3 -> {
                    vehicles[n] = new Car();
                    vehicles[n].input();
                    n++;
                    break;
                }
                    
            }
        }
    }
    
    public void output(){
        System.out.println("List of motorbikes :");
        System.out.println("\tID \tCompany \tManufacturing Year \tPrice \tColor \tCapacity");
        for(int i = 0; i < n; i++){
            if(vehicles[i] instanceof Motorbike){
                System.out.println(vehicles[i].toString());
                motorNumber++;
            }
        }
        System.out.println("Number of motorbikes: " + motorNumber);
        
        System.out.println("List of trucks :");
        System.out.println("\tID \tCompany \tManufacturing Year \tPrice \tColor \tWeight");
        for(int i = 0; i < n; i++){
            if(vehicles[i] instanceof Truck){
                System.out.println(vehicles[i].toString());
                truckNumber++; 
            }
        }
        System.out.println("Number of trucks: " + truckNumber);
        
        System.out.println("List of cars :");
        System.out.println("\tID \tCompany \tManufacturing Year \tPrice \tColor \tType of engine \tNumber of seats");
        for(int i = 0; i < n; i++){
            if(vehicles[i] instanceof Car){
                System.out.println(vehicles[i].toString());
                carNumber++;
            }
        }
        System.out.println("Number of cars: " + carNumber);
    }
    
    public void getByID(String id){
        System.out.println("List of vehicles :");
        System.out.print("\tID \tCompany \tManufacturing Year \tPrice \tColor");
        for(int i = 0; i < n; i++){
            if(vehicles[i].getId().equals(id)){
                if(vehicles[i] instanceof Motorbike){
                    System.out.println("\tCapacity");
                }
                else if(vehicles[i] instanceof Truck){
                    System.out.println("\tWeight");
                }
                else if(vehicles[i] instanceof Car){
                    System.out.println("\tType of engine \tNumber of seats");
                }
                System.out.println(vehicles[i].toString());
            }
        }
    }
    
    public void getByCompany(String company){
        System.out.println("List of vehicles :");
        System.out.print("\tID \tCompany \tManufacturing Year \tPrice \tColor");
        for(int i = 0; i < n; i++){
            if(vehicles[i].getCompany().equals(company)){
                if(vehicles[i] instanceof Motorbike){
                    System.out.println("\tCapacity");
                }
                else if(vehicles[i] instanceof Truck){
                    System.out.println("\tWeight");
                }
                else if(vehicles[i] instanceof Car){
                    System.out.println("\tType of engine \tNumber of seats");
                }
                System.out.println(vehicles[i].toString());
            }
        }
    }
    
    public void getByYearFrom()
}
