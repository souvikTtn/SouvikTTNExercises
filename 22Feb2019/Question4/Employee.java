package CollectionsAndDates.Question4;

public class Employee {
    private Double age;
    private Double salary;
    private String name;

    Employee(Double age,Double salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
