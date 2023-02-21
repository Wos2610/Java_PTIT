package controller;

import java.util.*;
import models.Client;
import models.Room;
import models.RoomList;

public class Input {
    private Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }
    
    public int getChoice(){
        System.out.print("Your choice: ");
        return Integer.parseInt(input.nextLine());
    }
    
    public Client inputClient(){
        System.out.print("Client's name : ");
        String name = input.nextLine();
        System.out.print("Client's address : ");
        String address = input.nextLine();
        System.out.print("Client's phone number: ");
        String phone = input.nextLine();
        System.out.print("Type of client (1. Student \t2. Family \t3. Enterprise): ");
        int i = Integer.parseInt(input.nextLine());
        String type = "";
        type = switch (i) {
            case 1 -> "Student";
            case 2 -> "Family";
            default -> "Enterprise";
        };
        
        return new Client(name, address, phone, type);
    }
    
    public Room inputRoom(){
        System.out.print("Room name : ");
        String name = input.nextLine();
        System.out.print("Type of room (1. VIP room \t2. High-quality room \t3. Normal room): ");
        int i = Integer.parseInt(input.nextLine());
        String type = "";
        switch (i) {
            case 1 -> type = "VIP room";
            case 2 -> type = "High-quality room";
            case 3 -> type = "Normal room";
        }
        return new Room(name, type);
    }
    
    public RoomList inputRoomList(ArrayList<Client> clients){
        System.out.print("Client ID: ");
        String clientID = input.nextLine();
        System.out.print("Room ID: ");
        String roomID = input.nextLine();
        System.out.print("Rent time: ");
        String rentTime = input.nextLine();
        
        String clientName = "";
        Client temp = Process.isHaveClient(clients, clientID);
        if(temp != null){
            clientName = temp.getName();
        }
        return new RoomList(clientID, roomID, rentTime, clientName);
    }
}
