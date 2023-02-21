package models;

public class Client {
    private static int idNum = 0;
    private String id;
    private String name;
    private String address;
    private String phone;
    private String type;

    public Client() {
    }

    public Client(String name, String address, String phone, String type) {
        idNum++;
        this.id = Integer.toString(idNum);
        while(this.id.length() != 5){
            this.id = "0" + this.id;
        }
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
                            + "Address : " + address + "\t"
                            + "Phone : " + phone + "\t"
                            + "Type : " + type + "\t";
    }
     
}
