package newproject1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.*;

class Rectangle{
    private double width;
    private double height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return this.height * this.width;
    }
    
    public double findPerimeter(){
        return (this.height + this.width) * 2;
    }

}


public class NewProject1 {
    private static String capitalize(String s){
        if(s.length() == 1) return s;
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while(T > 0){
            T--;
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            String s = sc.next();
            
            if(x <= 0 || y <= 0 || s.length() == 0){
                System.out.println("INVALID");
            }
            else{
                Rectangle a = new Rectangle(x, y, capitalize(s));
                System.out.printf("%.0f %.0f %s", a.findPerimeter(), a.findArea(), a.getColor());
            }
        }
    }
}
