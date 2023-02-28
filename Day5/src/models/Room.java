package models;

public class Room {
    private static int idNum = 0;
    private String id;
    private String name;
    private String type;
    private boolean isRented;
    private Client rentedClient;

    public Room() {
    }

    public Room(String name, String type) {
        idNum++;
        this.id = Integer.toString(idNum);
        while(this.id.length() != 3){
            this.id = "0" + this.id;
        }
        this.name = name;
        this.type = type;
        this.isRented = false;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public Client getRentedClient() {
        return rentedClient;
    }

    public void setRentedClient(Client rentedClient) {
        this.rentedClient = rentedClient;
    }
    
    
    @Override
    public String toString() {
        return "ID : " + id + "\t"
                            + "Name : " + name + "\t"
                            + "Type : " + type + "\t"
                            + "Rented : " + isRented;
    }
    
    
}
