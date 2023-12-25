import javax.swing.text.DateFormatter;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
    public static class NV{
        String ma, name;
        LocalTime timein, timeout;
        long time, hour, minute;

        public NV(String ma, String name, String timein, String timeout){
            this.ma = ma;
            this.name = name;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            this.timein = LocalTime.parse(timein, formatter);
            this.timeout = LocalTime.parse(timeout, formatter);
            this.time = this.timeout.getMinute() - this.timein.getMinute();
            this.hour = this.time / 60;
            this.minute = this.time - this.hour * 60;
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + hour + " " + minute;
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
        List<NV> arr = new ArrayList<>();

        for(int i = 1; i <= t; i++){
            NV x = new NV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        for(NV i : arr){
            System.out.println(i);
        }
    }
}
