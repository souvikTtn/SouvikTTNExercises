package Java8.Question10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,6,7,8,9,0,12,15,16,18,1,2,3);
        List myList=list.stream().filter(e-> e>5).collect(Collectors.toList());
        System.out.println(myList);
        System.out.println("sum of all the numbers in the list whose values is greater than 5");
        System.out.println(list.stream().filter(e-> e>5).collect(Collectors.summingInt(e->e)));
    }
}
