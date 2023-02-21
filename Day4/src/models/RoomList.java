package models;

import java.util.*;


public class RoomList {
    private String clientID;
    private String roomID;
    private String rentTime;
    private String clientName;

    public RoomList() {
    }

    public RoomList(String clientID, String roomID, String rentTime, String clientName) {
        this.clientID = clientID;
        this.roomID = roomID;
        this.rentTime = rentTime;
        this.clientName = clientName;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRentTime() {
        return rentTime;
    }

    public void setRentTime(String rentTime) {
        this.rentTime = rentTime;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    
    
    
}
