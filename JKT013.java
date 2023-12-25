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
        long[] a = new long[20];
        a[1] = 10;
        for(int i = 2; i <= 15; i++){
            a[i] = a[i - 1] * 10;
        }
        
        while (T > 0) {
            T -= 1;
            int n = Integer.parseInt(sc.nextLine());
            Queue<Long> q = new LinkedList<>();
            List<Long> l = new ArrayList<>();
            q.add(Long.valueOf(6));
            q.add(Long.valueOf(8));
            l.add(Long.valueOf(6));
            l.add(Long.valueOf(8));
            while(true) {
                long tmp = q.poll();
                if(tmp * 10 + 6 < a[n]){
                    q.add(tmp * 10 + 6);
                    l.add(tmp * 10 + 6);
                }
                else break;
                if(tmp * 10 + 8 < a[n]){
                    q.add(tmp * 10 + 8);
                    l.add(tmp * 10 + 8);
                }
                else break;
            }
            System.out.println(l.size());
            Collections.sort(l, Collections.reverseOrder());
            for(Long i : l){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
