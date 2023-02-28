package models;

import controller.InvalidInfoException;
import java.util.*;

public class Client {
    private static int idNum = 0;
    private String id;
    private String name;
    private String address;
    private String phone;
    private String type;
    private Room rentedRoom;
    private String rentedDate;
    
    public Client() {
    }

    public Client(String name, String address, String phone, String type) throws InvalidInfoException {
        idNum++;
        this.id = Integer.toString(idNum);
        while(this.id.length() != 5){
            this.id = "0" + this.id;
        }
        this.name = name;
        this.address = address;
        setPhone(phone);
        this.type = type;
        this.rentedRoom = null;
        this.rentedDate = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws InvalidInfoException {
        if(phone.matches("\\d{10}")) this.phone = phone;
        else throw new InvalidInfoException("Invalid Phone Number.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Room getRentedRoom() {
        return rentedRoom;
    }

    public void setRentedRoom(Room room) {
        this.rentedRoom = room;
    }

    public String getRentedDate() {
        return rentedDate;
    }

    public void setRentedDate(String rentedDate) {
        this.rentedDate = rentedDate;
    }
    
    
    

    @Override
    public String toString() {
        return "ID : " + id + "\t"
                            + "Name : " + name + "\t"
                            + "Address : " + address + "\t"
                            + "Phone : " + phone + "\t"
                            + "Type : " + type + "\t" 
                            + "\nRented room => " + rentedRoom + "\t"
                            + "Rented date : " + rentedDate;
    }
     
}
