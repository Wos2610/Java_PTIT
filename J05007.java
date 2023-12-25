import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J05007 {
    static class Worker{
        String ma, name, gender, date, address, maSoThue, ngayKy;
        int stt;
        LocalDate localDate;
        //        private static String chuanHoaTen(String name) {
//            name = name.replaceAll("\\s+", " ").trim();
//            String[] arr = name.split("\\s+");
//            int n = arr.length;
//            String res = "";
//            for (int i = 0; i < n; i++) {
//                arr[i] = arr[i].toLowerCase();
//                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
//                res += arr[i];
//                if (i != n - 1) {
//                    res += " ";
//                }
//            }
//            return res;
//        }
//
//        private static String chuanHoaDate(String date) {
//            if (date.charAt(1) == '/') {
//                date = "0" + date;
//            }
//            if (date.charAt(4) == '/') {
//                date = date.substring(0, 3) + "0" + date.substring(3);
//            }
//            return date;
//        }
//
        public Worker(int stt, String name, String gender, String date, String address, String maSoThue, String ngayKy){
            this.stt = stt;
            this.ma = String.format("%05d", stt);
            this.name = name;
            this.gender = gender;
            this.date = date;
            this.address = address;
            this.maSoThue = maSoThue;
            this.ngayKy = ngayKy;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.localDate = LocalDate.parse(date, formatter);
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + gender + " " + date + " " + address + " " +  maSoThue + " " + ngayKy;
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
        List<Worker> workers = new ArrayList<>();
        for(int i = 1; i <= t; i++){
            Worker x = new Worker(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            workers.add(x);
        }

        workers.sort((a, b) -> {
            return a.localDate.compareTo(b.localDate);
        });

        for(Worker i : workers){
            System.out.println(i);
        }
    }
}
