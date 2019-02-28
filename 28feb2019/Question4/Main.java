package Java8.Question4;

public class Main {
    public static void main(String[] args) {
        EmployeeInterface employeeInterface=Employee::new;
        Employee employee=employeeInterface.getEmployee("souvik",24,"delhi");
        System.out.println(employee);
    }
}
