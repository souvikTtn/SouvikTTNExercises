package Java8.Question5;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import Java8.Question4.Employee;

public class Main {
    public static void main(String[] args) {
        Consumer consumer=(e-> System.out.println(e));
        consumer.accept(new Employee("dhruv",24,"palam"));
        Supplier supplier=()->{
            return 3;
        };
        System.out.println(supplier.get());

        Predicate predicate=e->(Integer) e%2==0;
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(4));

        Function function=e->(Integer)e*2;
        System.out.println(function.apply(5));

    }



}
