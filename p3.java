import java.util.LinkedList;

public class p3 {
    public static void main(String[] args) {
        LinkedList<Integer> employee = new LinkedList<>();
        employee.add(1);
        employee.add(2);
        employee.add(3);
        employee.add(4);
        employee.add(5);
    
        for(int employeeId : employee) {
            System.out.println("Employee ID: " + employeeId);
        }
    }
}
