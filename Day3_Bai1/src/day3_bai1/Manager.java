package day3_bai1;

import java.io.*;
import java.util.*;


public class Manager {
    private List<Product> products;
    private List<Personnel> personnels;
    private List<Client> clients;
    private List<Order> orders;

    public Manager() {
        products = new ArrayList<Product>();
        personnels = new ArrayList<Personnel>();
        clients = new ArrayList<Client>();
        orders = new ArrayList<Order>();
    }
    
    public void addNewProduct() throws IOException{
        Product p = new Product();
        products.add(p);
        p.input();
    }
    
    public void addNewPersonnel() throws IOException{
        Personnel p = new Personnel();
        personnels.add(p);
        p.input();
    }
    
    public void addNewClient() throws IOException{
        Client c = new Client();
        clients.add(c);
        c.input();
    }
    
    public void addNewOrder(){
        Order o = new Order();
        orders.add(o);
        o.input();
    }
    
    public void showProductInfo(){
        System.out.println("ID \t Name \t Group \t Type \t Price");
        for(Product i : products){
            System.out.println(i.toString());
        }
    }
    
    public void showPersonnelInfo(){
        System.out.println("ID \t Name \t Address \t Phone \t Type");
        for(Personnel i : personnels){
            System.out.println(i.toString());
        }
    }
    
    public void showClientInfo(){
        System.out.println("ID \t Name \t Address \t Phone \t Gmail");
        for(Client i : clients){
            System.out.println(i.toString());
        }
    }
    
    public void showClientInfoInOrder(){
        System.out.println("ID \t Name \t Address \t Phone \t Gmail");
        try {
            Scanner sc = new Scanner(new File("DH.txt"));
            int i = 1;
            while(sc.hasNext()){
                String s = sc.next();
                if(i % 6 == 2){
                    for(Client c : clients){
                        if(c.getcId().equals(s)){
                            System.out.println(c.toString());
                        }
                    }
                } 
                i++;
                
            }
            sc.close();
        } catch (IOException ex) {
            
        }
        
    }
    
    public void sortByTime(){
        Collections.sort(orders, new Comparator<Order>(){
            @Override
            public int compare(Order o1, Order o2) {
                if(o1.getTime().compareTo(o2.getTime()) > 0){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
    }
    
    public void sortByPersonnelId(){
        Collections.sort(orders, new Comparator<Order>(){
            @Override
            public int compare(Order o1, Order o2) {
                if(o1.getPersonnelId().compareTo(o2.getPersonnelId()) > 0){
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
    }
    
    public void sortByClientName(){
        
    }
    
    public void calSalary(){
        
    }
}
