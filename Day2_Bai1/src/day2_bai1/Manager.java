package day2_bai1;

import java.util.*;

public class Manager {
    private List<Vehicle> vehicles;
    private int n;
    private int motorNumber;
    private int truckNumber;
    private int carNumber;

    public Manager() {
        vehicles = new ArrayList<Vehicle>();
        n = 0;
        motorNumber = 0;
        truckNumber = 0;
        carNumber = 0;
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
            Vehicle v;
            int c = Integer.parseInt(input.nextLine());
            switch(c){
                case 1 -> {
                    v = new Motorbike();
                    v.input();
                    vehicles.add(v);
                    n++;
                    break;
                }
                
                case 2 -> {
                    v = new Truck();
                    v.input();
                    vehicles.add(v);
                    n++;
                    break;
                }
                
                case 3 -> {
                    v = new Car();
                    v.input();
                    vehicles.add(v);
                    n++;
                    break;
                }
                    
            }
        }
    }
    
    public void output(){
        System.out.println("List of motorbikes :");
        System.out.println("\tID \tCompany \tManufacturing Year \tPrice \tColor \tCapacity");
        for(Vehicle v : vehicles){
            if(v instanceof Motorbike){
                System.out.println(v.toString());
                motorNumber++;
            }
        }
        System.out.println("Number of motorbikes: " + motorNumber);
        
        System.out.println("List of trucks :");
        System.out.println("\tID \tCompany \tManufacturing Year \tPrice \tColor \tWeight");
        for(Vehicle v : vehicles){
            if(v instanceof Truck){
                System.out.println(v.toString());
                truckNumber++; 
            }
        }
        System.out.println("Number of trucks: " + truckNumber);
        
        System.out.println("List of cars :");
        System.out.println("\tID \tCompany \tManufacturing Year \tPrice \tColor \tType of engine \tNumber of seats");
        for(Vehicle v : vehicles){
            if(v instanceof Car){
                System.out.println(v.toString());
                carNumber++;
            }
        }
        System.out.println("Number of cars: " + carNumber);
    }
    
    public void getByID(String id){
        System.out.println("List of vehicles :");
        System.out.print("\tID \tCompany \tManufacturing Year \tPrice \tColor");
        for(Vehicle v : vehicles){
            if(v.getId().equals(id)){
                if(v instanceof Motorbike){
                    System.out.println("\tCapacity");
                }
                else if(v instanceof Truck){
                    System.out.println("\tWeight");
                }
                else if(v instanceof Car){
                    System.out.println("\tType of engine \tNumber of seats");
                }
                System.out.println(v.toString());
            }
        }
    }
    
    public void getByCompany(String company){
        System.out.println("List of vehicles :");
        System.out.print("\tID \tCompany \tManufacturing Year \tPrice \tColor");
        for(Vehicle v : vehicles){
            if(v.getCompany().equals(company)){
                if(v instanceof Motorbike){
                    System.out.println("\tCapacity");
                }
                else if(v instanceof Truck){
                    System.out.println("\tWeight");
                }
                else if(v instanceof Car){
                    System.out.println("\tType of engine \tNumber of seats");
                }
                System.out.println(v.toString());
            }
        }
    }
    
    public void getByYearFrom(double from, double to){
        System.out.println("List of vehicles :");
        System.out.print("\tID \tCompany \tManufacturing Year \tPrice \tColor");
        for(Vehicle v : vehicles){
            if(v.getYear() >= from && v.getYear() <= to){
                if(v instanceof Motorbike){
                    System.out.println("\tCapacity");
                }
                else if(v instanceof Truck){
                    System.out.println("\tWeight");
                }
                else if(v instanceof Car){
                    System.out.println("\tType of engine \tNumber of seats");
                }
                System.out.println(v.toString());
            }
        }
    }
    
    public void getByPriceFrom(double from, double to){
        System.out.println("List of vehicles :");
        System.out.print("\tID \tCompany \tManufacturing Year \tPrice \tColor");
        for(Vehicle v : vehicles){
            if(v.getPrice() >= from && v.getPrice() <= to){
                if(v instanceof Motorbike){
                    System.out.println("\tCapacity");
                }
                else if(v instanceof Truck){
                    System.out.println("\tWeight");
                }
                else if(v instanceof Car){
                    System.out.println("\tType of engine \tNumber of seats");
                }
                System.out.println(v.toString());
            }
        }
    }
    
    
    public void sortByCompany(){
        Collections.sort(vehicles, new Comparator<Vehicle>(){
            @Override
            public int compare(Vehicle o1, Vehicle o2) {
                return o1.getCompany().compareToIgnoreCase(o2.getCompany());
            }
            }    
        );
    }
    
    
}
