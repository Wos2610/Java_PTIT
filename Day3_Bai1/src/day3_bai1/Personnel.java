package day3_bai1;

import java.util.*;
import java.io.*;

public class Personnel {
    private String id;
    private String name;
    private String add;
    private int phone;
    private String type;

    public Personnel() {
    }

    public Personnel(String id, String name, String add, int phone) {
        this.id = id;
        this.name = name;
        this.add = add;
        this.phone = phone;
        if((id.substring(0, 1)).equals("FT")){
            this.type = "Full-time";
        }
        else{
            this.type = "Part-time";
        }
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void input() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        this.id = input.nextLine();
        System.out.print("Ho ten nhan vien: ");
        this.name = input.nextLine();
        System.out.print("Dia chi nhan vien: ");
        this.add = input.nextLine();
        System.out.print("So dien thoai nhan vien: ");
        this.phone = Integer.parseInt(input.nextLine());
        
        try{
            FileWriter w = new FileWriter("NV.txt");
            w.write(this.toString());
            w.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
    @Override
    public String toString() {
        return this.id + "\t" + this.name + "\t" + this.add + "\t" + this.phone + "\t" + this.type;
    }
    
    public void output(){
        System.out.println(this.id + "\t" + this.name + "\t" + this.add + "\t" + this.phone + "\t" + this.type);
    }
}
