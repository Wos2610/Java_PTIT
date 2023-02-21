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
    
    public void run(){
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
                    roomLists.add(input.inputRoomList(clients));
                    break;
                }
                case 6:{
                    Process.statisticRoom(roomLists, rooms);
                    break;
                }
                
                case 7:{
                    output.roomListOutput(roomLists, clients);
                    break;
                }
                case 8:{
                    Process.sortRoomListByClientName(roomLists);
                    output.roomListOutput(roomLists, clients);
                    break;
                }
                case 9:{
                    Process.sortRoomListByRentTime(roomLists);
                    output.roomListOutput(roomLists, clients);
                    break;
                }
            }
        }
    }
    
    
    
}
