import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05009 {
    static class Student{
        String ma, name, gender, date, address, maSoThue, ngayKy;
        int stt;
        Double x1, x2, x3, x;
        private static String chuanHoaTen(String name) {
            name = name.replaceAll("\\s+", " ").trim();
            String[] arr = name.split("\\s+");
            int n = arr.length;
            String res = "";
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i].toLowerCase();
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
                res += arr[i];
                if (i != n - 1) {
                    res += " ";
                }
            }
            return res;
        }

        private static String chuanHoaDate(String date) {
            if (date.charAt(1) == '/') {
                date = "0" + date;
            }
            if (date.charAt(4) == '/') {
                date = date.substring(0, 3) + "0" + date.substring(3);
            }
            return date;
        }

       public Student(int stt, String name, String date, double x1, double x2, double x3){
            this.stt = stt;
            this.ma = String.valueOf(stt);
            this.name = name;
            this.date = date;
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x = x1 + x2 + x3;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + date + " " + x;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
//        List<String> b = new ArrayList<>();
//        b.add("Jhsf00dklT12uhf780LPPZH");
//        b.add("AAAAddd0000000000000000001T");
//        oos.writeObject(b);
//        oos.close();
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
//        List<String> arr = (ArrayList<String>) ois.readObject();
//        ois.close();

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        List<Student> workers = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            Student x = new Student(i, sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            workers.add(x);
        }

        workers.sort((a, b) -> {
            return Double.compare(b.x, a.x);
        });

        Double max = workers.get(0).x;
        for(Student i : workers){
            if(Double.compare(i.x, max) == 0) {
                System.out.println(i);
            }
        }
    }
}
