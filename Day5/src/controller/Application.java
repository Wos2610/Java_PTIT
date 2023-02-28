package controller;

import java.util.*;
import models.Client;
import models.Room;
import models.RoomList;

public class Application {
    private ArrayList<Client> clients;
    private ArrayList<Room> rooms;
    private ArrayList<RoomList> roomLists;
    
    private Input input;
    private Output output;
    

    public Application() {
        clients = new ArrayList<>();
        rooms = new ArrayList<>();
        roomLists = new ArrayList<>();
        input = new Input();
        output = new Output();
    }
    
    public void run() throws InvalidInfoException{
        int c = -1;
        while(c != 0){
            output.showMenu();
            c = input.getChoice();
            switch(c){
                case 1:{
                    clients.add(input.inputClient());
                    break;
                }
                case 2:{
                    rooms.add(input.inputRoom());
                    break;
                }
                case 3:{
                    output.clientOutput(clients);
                    break;
                }
                case 4:{
                    output.roomOutput(rooms);
                    break;
                }
                case 5:{
                    input.inputRoomList(clients, rooms);
                    break;
                }
                case 6:{
                    Process.statisticRoom(rooms, clients);
                    break;
                }
                
                case 7:{
                    System.out.println("Rented client room information: ");
                    output.roomListOutput(rooms, clients);
                    break;
                }
                case 8:{
                    System.out.println("Sort client list by client name: ");
                    Process.sortRoomListByClientName(clients);
                    output.roomListOutput(rooms, clients);
                    break;
                }
                case 9:{
                    System.out.println("Sort client list by rent time: ");
                    Process.sortRoomListByRentTime(clients);
                    output.roomListOutput(rooms, clients);
                    break;
                }
            }
        }
    }
    
    
    
}
