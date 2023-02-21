package models;

public class Room {
    private static int idNum = 0;
    private String id;
    private String name;
    private String type;

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

    @Override
    public String toString() {
        return "ID : " + id + "\t"
                            + "Name : " + name + "\t"
                            + "Type : " + type + "\t";
    }
    
    
}
