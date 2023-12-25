import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static void tongChuSo(String s){
        while(s.length() > 1 && s.charAt(0) == '0'){
            s = s.substring(1);
        }
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        System.out.println(s + " " + sum);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        List<String> b = new ArrayList<>();
//        b.add("Jhsf00dklT12uhf780LPPZH");
//        b.add("AAAAddd0000000000000000001T");
//        oos.writeObject(b);
//        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        List<String> arr = (ArrayList<String>) ois.readObject();
        ois.close();

        for(int i = 0; i < arr.size(); i++){
            String[] arr2 = arr.get(i).split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
            String res = "";
            for(String j : arr2){
                if(j.matches("[0-9]+")){
                    res += j;
                }
            }
            tongChuSo(res);
        }
    }
}