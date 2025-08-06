import java.util.ArrayList;

public class p1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("student 1");
        list.add("student 2");
        list.add("student 3");
        list.add("student 4");
        list.add("student 5");

        System.out.println("List of students:");

        for (String student : list) {
            System.out.println(student);
        }

    }
}