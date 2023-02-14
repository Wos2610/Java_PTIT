package day3_bai1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Order {
    static private int orderId = 0;
    private String oId;
    private String productId;
    private String clientId;
    private String personnelId;
    private int quantity;
    private String time;

    public Order() {
        orderId++;
        oId = String.valueOf(orderId);
        while(oId.length() < 6){
            oId = "0" + oId;
        }
    }

    public Order(String productId, String clientId, String personnelId, int quantity, String time) {
        this.productId = productId;
        this.clientId = clientId;
        this.personnelId = personnelId;
        this.quantity = quantity;
        this.time = time;
    }

    public static int getOrderId() {
        return orderId;
    }

    public static void setOrderId(int orderId) {
        Order.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(String personnelId) {
        this.personnelId = personnelId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ma san pham: ");
        this.productId = input.nextLine();
        System.out.print("Ma khach hang mua san pham: ");
        this.clientId = input.nextLine();
        System.out.print("Ma nhan vien ban san pham: ");
        this.personnelId = input.nextLine();
        System.out.print("So luong hang da mua: ");
        this.quantity = Integer.parseInt(input.nextLine());
        
        try{
            FileWriter w = new FileWriter("DH.txt");
            w.write("ProductID \t ClientID \t PersonnelID \t Quantity \t Time \t OrderID\n");
            w.write(this.toString());
            w.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public String toString() {
        return this.productId + "\t" + this.clientId + "\t" + this.personnelId + "\t" + this.quantity + "\t" + this.time + "\t" + this.oId;
    }
    
}
