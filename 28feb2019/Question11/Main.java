package Java8.Question11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,6,7,8,9,0,12,15,16,18,1,2,3);
        System.out.println("average of all the numbers in the list after doubling it ");
        System.out.println(list.stream().collect(Collectors.averagingInt(e->e*2)));
    }
}
