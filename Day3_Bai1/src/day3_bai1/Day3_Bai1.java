package day3_bai1;

import java.io.IOException;
import java.util.Scanner;

public class Day3_Bai1 {

    public static void main(String[] args) throws IOException {
        Manager manager = new Manager();
        
        System.out.println("=======MENU=======");
        System.out.println("1. Nhap mat hang moi.");
        System.out.println("2. Nhap nhan vien moi.");
        System.out.println("3. Nhap khach hang moi.");
        System.out.println("4. Nhap don hang moi.");
        System.out.println("5. In danh sach mat hang.");
        System.out.println("6. In danh sach nhan vien.");
        System.out.println("7. In danh sach khach hang trong file KH.");
        System.out.println("8. In danh sach khach hang trong file DH.");
        System.out.println("9. Sap xep danh sach don hang theo thoi gian mua.");
        System.out.println("10. Sap xep danh sach don hang theo ID nhan vien.");
        System.out.println("11. Sap xep danh sach don hang theo ten khach hang.");
        System.out.println("12. Tinh luong cho nhan vien.");
        System.out.println("0. Exit");
        Scanner input = new Scanner(System.in);
        int c = -1;
        while(c != 0){
            System.out.print("-> Your choice: ");
            c = Integer.parseInt(input.nextLine());
            switch(c){
                case 1:{
                    manager.addNewProduct();
                    break;
                }
                case 2:{
                    manager.addNewPersonnel();
                    break;
                }
                case 3:{
                    manager.addNewClient();
                    break;
                }
                case 4:{
                    manager.addNewOrder();
                    break;
                }
                case 5:{
                    manager.showProductInfo();
                    break;
                }
                case 6:{
                    manager.showPersonnelInfo();
                    break;
                }
                case 7:{
                    manager.showClientInfo();
                    break;
                }
                case 8:{
                    manager.showClientInfoInOrder();
                    break;
                }
                case 9:{
                    manager.sortByTime();
                    break;
                }
                case 10:{
                    manager.sortByPersonnelId();
                    break;
                }
                case 11:{
                    manager.sortByClientName();
                    break;
                }
                case 12:{
                    manager.showClientInfoInOrder();
                    break;
                }
            }
        }
    }
    
}
