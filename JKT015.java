package newproject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class NewProject1 {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int n = s.length();
        int index = 0;
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i = 0; i < n; i++){
            switch (s.charAt(i)) {
                case '<':
                    if(!st1.empty()){
                        st2.push(st1.pop());
                    }
                    break;
                case '>':
                    if(!st2.empty()){
                        st1.push(st2.pop());
                    }
                    break;
                case '-':
                    if(!st1.empty()){
                        st1.pop();
                    }
                    break;
                default:
                    st1.push(s.charAt(i));
                    break;
                 
            }
        }
        while(!st1.empty()){
            st2.push(st1.pop());
        }
        
        while(!st2.empty()){
            System.out.print(st2.pop());
        }
        System.out.println();
    }
    
}
