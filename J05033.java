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

class Time {

    private int h, m, s;

    public Time() {
    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setS(int s) {
        this.s = s;
    }
    
    

}

public class NewProject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 1;
        while (T > 0) {
            T--;
            int n = Integer.parseInt(sc.nextLine());
            List<Time> times = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String[] tmp = sc.nextLine().split(" ");
                times.add(new Time(0, 0, 0));
                times.get(i).setH(Integer.parseInt(tmp[0]));
                times.get(i).setM(Integer.parseInt(tmp[1]));
                times.get(i).setS(Integer.parseInt(tmp[2]));
            }
            Collections.sort(times, (Time o1, Time o2) -> {
                if (o1.getH() == o2.getH()) {
                    if (o1.getM() == o2.getM()) {
                        return o1.getS() - o2.getS();
                    } else {
                        return o1.getM() - o2.getM();
                    }
                }
                return o1.getH() - o2.getH();
            });
            for (Time i : times) {
                System.out.printf("%d %d %d\n", i.getH(), i.getM(), i.getS());
            }
        }
    }
}
