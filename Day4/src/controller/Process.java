package controller;

import java.util.*;
import models.Client;
import models.Room;
import models.RoomList;

public class Process {
    private int vipNum;
    private int highQualityNum;
    private int normalNum;
    
    private static Map<String, Integer> roomNum = new HashMap<>();
    
    
    
    public static void statisticRoom(ArrayList<RoomList> roomLists, ArrayList<Room> rooms){
        for(RoomList i : roomLists){
            Room temp = Process.isHaveRoom(rooms, i.getRoomID());
            if(temp != null){
                roomNum.put(temp.getType(), roomNum.get(temp.getType()) + 1);
            }
        }
        
        for(Map.Entry<String, Integer> i : roomNum.entrySet()){
            System.out.println(i.getKey() + ": " + i.getValue()/roomLists.size());
        }
    }
    
    public static Room isHaveRoom(ArrayList<Room> rooms, String roomID){
        for(Room i : rooms){
            if(i.getId().compareTo(roomID) == 0){
                return i;
            }
        }
        return null;
    }
    
    public static Client isHaveClient(ArrayList<Client> clients, String clientID){
        for(Client i : clients){
            if(i.getId().compareTo(clientID) == 0){
                return i;
            }
        }
        return null;
    }
    
    public static void sortRoomListByClientName(ArrayList<RoomList> roomLists){
        Collections.sort(roomLists, new Comparator<RoomList>(){
            @Override
            public int compare(RoomList o1, RoomList o2) {
                if(o1.getClientName().compareTo(o2.getClientName()) > 0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
    
    public static void sortRoomListByRentTime(ArrayList<RoomList> roomLists){
        Collections.sort(roomLists, new Comparator<RoomList>(){
            @Override
            public int compare(RoomList o1, RoomList o2) {
                if(o1.getRentTime().compareTo(o2.getRentTime()) > 0){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        });
    }
}
