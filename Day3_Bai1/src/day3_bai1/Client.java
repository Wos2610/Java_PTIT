package day3_bai1;

import java.util.*;
import java.io.*;

public class Client {
    static private int id = 0;
    private String cId;
    private String name;
    private String add;
    private int phone;
    private String mail;

    public Client() {
        id++;
        cId = String.valueOf(id);
        while(cId.length() < 5){
            cId = "0" + cId;
        }
    }

    public Client(String name, String add, int phone, String mail) {
        this.name = name;
        this.add = add;
        this.phone = phone;
        this.mail = mail;
    }
    

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Client.id = id;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public void input() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Ho ten khach hang: ");
        this.name = input.nextLine();
        System.out.print("Dia chi khach hang: ");
        this.add = input.nextLine();
        System.out.print("So dien thoai khach hang: ");
        this.phone = Integer.parseInt(input.nextLine());
        System.out.print("Gmail khach hang: ");
        this.mail = input.nextLine();
        
        try{
            FileWriter w = new FileWriter("KH.txt");
            w.write(this.toString());
            w.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public String toString() {
        return this.cId + "\t" + this.name + "\t" + this.add + "\t" + this.phone + "\t" + this.mail;
    }
    
}
