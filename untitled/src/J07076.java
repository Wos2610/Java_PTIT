//import java.io.*;
//import java.util.*;
//
//public class J07076 {
//    static void tongChuSo(String s){
//        while(s.length() > 1 && s.charAt(0) == '0'){
//            s = s.substring(1);
//        }
//        int sum = 0;
//        for(int i = 0; i < s.length(); i++){
//            sum += Integer.parseInt(s.charAt(i) + "");
//        }
//        System.out.println(s + " " + sum);
//    }
//    public static void main(String[] args) throws IOException, ClassNotFoundException {
////        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
////        List<String> b = new ArrayList<>();
////        b.add("Jhsf00dklT12uhf780LPPZH");
////        b.add("AAAAddd0000000000000000001T");
////        oos.writeObject(b);
////        oos.close();
////        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
////        List<String> arr = (ArrayList<String>) ois.readObject();
////        ois.close();
//
//        Scanner sc = new Scanner(new File("MATRIX.in"));
//        int t = Integer.parseInt(sc.nextLine());
//        while(t > 0){
//            t -= 1;
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            int i = sc.nextInt();
//
//            int[][] a = new int[n + 1][m + 1];
//            List<Integer> b = new ArrayList<>();
//            for(int j = 1; j <= n; j++){
//                for(int k = 1; k <= m; k++){
//                    a[j][k] = sc.nextInt();
//                    if(k == i) b.add(a[j][k]);
//                }
//            }
//
//            Collections.sort(b);
//            for(int j = 1; j <= n; j++){
//                for(int k = 1; k <= m; k++){
//                    if(k == i) System.out.print(b.get(j - 1) + " ");
//                    else System.out.print(a[j][k] + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
//}