import java.util.Vector;

public class p2 {
    public static void main(String[] args) {

        Vector<String> list = new Vector<>();
        list.add("suzuki");
        list.add("yamaha");
        list.add("honda");
        list.add("kawasaki");
        list.add("ducati");

        for (String bike : list) {
            System.out.println(bike);
        }
    }
    
    
}
