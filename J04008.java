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

class Point{
    private double x, y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double distance(Point p2){
        return Math.sqrt((p2.y - this.y) * (p2.y - this.y) + (p2.x - this.x) * (p2.x - this.x));
    }
    
    public double distance(Point p1, Point p2){
        return Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}

public class NewProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            T--;
            Point x = new Point(sc.nextDouble(), sc.nextDouble());
            Point y = new Point(sc.nextDouble(), sc.nextDouble());
            Point z = new Point(sc.nextDouble(), sc.nextDouble());
            
            double xy = x.distance(y);
            double xz = x.distance(z);
            double yz = y.distance(z);
            
            if(xy + xz > yz && xy + yz > xz && yz + xz > xy){
                System.out.printf("%.3f\n", xy + xz + yz);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
