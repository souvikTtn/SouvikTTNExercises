package Java8.Question9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,6,7,8,9,0,12,15,16,18,1,2,3);
        System.out.println("even numbers present in the list are as follows");
        List<Integer> evenList=list.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
