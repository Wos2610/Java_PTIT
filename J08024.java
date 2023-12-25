package newproject1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

public class NewProject1 {

    private static void tinh() {

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        while (T > 0) {
            T -= 1;
            int n = Integer.parseInt(sc.nextLine());
            Queue<Long> q = new LinkedList<>();
            q.add(Long.valueOf(9));
            while(true) {
                long tmp = q.poll();
                if(tmp % n == 0) {
                    System.out.println(tmp);
                    break;
                }
                if((tmp * 10) % n == 0) {
                    System.out.println(tmp * 10);
                    break;
                }
                else{
                    q.add(tmp * 10);
                }
                if((tmp * 10 + 9) % n == 0) {
                    System.out.println(tmp * 10 + 9);
                    break;
                }   
                else{
                    q.add(tmp * 10 + 9);
                }
            }
        }
    }
}
