package CollectionsAndDates.Question4;

/*Write a program to sort Employee objects based on highest salary using Comparator.
        Employee class{ Double Age; Double Salary; String Name*/

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee(25d,20000d,"souvik");
        Employee e2=new Employee(26d,25000d,"dhruv");
        Employee e3=new Employee(29d,2000d,"deepak");
        Employee e4=new Employee(20d,1000d,"deepika");
        Employee e5=new Employee(21d,50000d,"kanchan");
        Employee e6=new Employee(25d,9000d,"divya");

        List<Employee> employees=Arrays.asList(e1,e2,e3,e4,e5,e6);
        Collections.sort(employees,new MyComparator());
       for (Employee employee : employees){
           System.out.println(employee.getName()+" "+employee.getAge()+" "+employee.getSalary());
       }


    }
}
