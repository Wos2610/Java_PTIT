package controller;

import java.util.ArrayList;
import models.Client;
import models.Room;
import models.RoomList;


public class Output {
    
    public void showMenu(){
        System.out.println("========MENU========");
        System.out.println("1. Them khach hang.");
        System.out.println("2. Them phong.");
        System.out.println("3. Liet ke thong tin khach hang.");
        System.out.println("4. Liet ke cac phong co san theo phan loai.");
        System.out.println("5. Them danh sach phong duoc thue.");
        System.out.println("6. Thong ke luong khach hang chon thue cac loai phong.");
        System.out.println("7. Thong tin thue phong theo ten khach hang.");
        System.out.println("8. Sap xep khach hang theo ten.");
        System.out.println("9. Sap xep khach hang theo thoi gian thue phong.");
        System.out.println("0. Exit.");
    }
    public void clientOutput(ArrayList<Client> clients){
        System.out.println("List of clients: ");
        for(Client i : clients){
            System.out.println(i.toString());
        }
    }
    
    public void roomOutput(ArrayList<Room> rooms){
        System.out.println("List of available VIP rooms: ");
        for(Room i : rooms){
            if(i.getType().compareTo("VIP room") == 0 && i.isIsRented() == false){
                System.out.println(i.toString());
            }
        }
        
        System.out.println("List of available high-quality rooms: ");
        for(Room i : rooms){
            if(i.getType().compareTo("High-quality room") == 0 && i.isIsRented() == false){
                System.out.println(i.toString());
            }
        }
        
        System.out.println("List of available normal rooms: ");
        for(Room i : rooms){
            if(i.getType().compareTo("Normal room") == 0 && i.isIsRented() == false){
                System.out.println(i.toString());
            }
        }
    }
    
    public void roomListOutput(ArrayList<Room> rooms, ArrayList<Client> clients) throws InvalidInfoException{
       
        for(Client i : clients){
            try {
                if (i.getRentedRoom() != null && i.getRentedDate() != null){
                    System.out.println(i.toString());
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
