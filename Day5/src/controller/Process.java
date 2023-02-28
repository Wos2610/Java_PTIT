package controller;

import java.util.*;
import models.Client;
import models.Room;


public class Process {
    private int vipNum;
    private int highQualityNum;
    private int normalNum;
    
    private static Map<String, Integer> roomNum = new HashMap<>();
    private static int allRoomNum;
    
    private static Process instance;
    
    public static void bookRoom(String roomID, ArrayList<Room> rooms, String clientID, ArrayList<Client> clients, String rentedDate) throws InvalidInfoException{
       Room room = Process.isHaveRoom(rooms, roomID);
       Client client = Process.isHaveClient(clients, clientID);
       room.setIsRented(true);
       client.setRentedRoom(room);
       client.setRentedDate(rentedDate);
    }
    public static void statisticRoom(ArrayList<Room> rooms, ArrayList<Client> clients) throws InvalidInfoException {
        roomNum.put("VIP room", 0);
        roomNum.put("High-quality room", 0);
        roomNum.put("Normal room", 0);
        
        if(clients != null && rooms != null){
            for(Client i : clients){
                Room rentedRoom = i.getRentedRoom();
                if(rentedRoom != null){
                    roomNum.put(rentedRoom.getType(), roomNum.get(rentedRoom.getType()) + 1);
                    allRoomNum++;
                }
            }

            for(Map.Entry<String, Integer> i : roomNum.entrySet()){
                System.out.println(i.getKey() + ": " + (float)i.getValue()/allRoomNum * (float)100 + "%");
            }
        }
    }
    
    public static Room isHaveRoom(ArrayList<Room> rooms, String roomID) throws InvalidInfoException{
        for(Room i : rooms){
            if(i.getId().compareTo(roomID) == 0){
                return i;
            }
        }
        throw new InvalidInfoException("Invalid room.");
    }
    
    public static Client isHaveClient(ArrayList<Client> clients, String clientID) throws InvalidInfoException {
        for(Client i : clients){
            if(i.getId().compareTo(clientID) == 0){
                return i;
            }
        }
        throw new InvalidInfoException("Invalid client");
    }
    
    public static void sortRoomListByClientName(ArrayList<Client> clients){
        Collections.sort(clients, new Comparator<Client>(){
            @Override
            public int compare(Client o1, Client o2) {
                if(o1.getName().compareToIgnoreCase(o2.getName()) < 0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
    
    public static void sortRoomListByRentTime(ArrayList<Client> clients){
        Collections.sort(clients, new Comparator<Client>(){
            @Override
            public int compare(Client o1, Client o2) {
                if(o1.getRentedDate().compareTo(o2.getRentedDate()) > 0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
}
