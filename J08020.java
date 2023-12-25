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

    static char[] s0 = {'(', '[', '{'};
    static char[] s1 = {')', ']', '}'};

    private static boolean check(String s) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            
            for (int j = 0; j < 3; j++) {
                if (s.charAt(i) == s0[j]) {
                    st.push(j);
                }
                if (s.charAt(i) == s1[j]) {
                    if(st.size() == 0) return false;
                    if (st.peek() != j) {
                        return false;
                    }
                    else{
                        st.pop();
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        while (T > 0) {
            T -= 1;
            String s = sc.nextLine();
            if (check(s) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
