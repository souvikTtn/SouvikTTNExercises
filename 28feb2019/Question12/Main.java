package Java8.Question12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(4,5,6,7,8,9,0,12,15,16,18,1,2,3);
        System.out.println("Finding the first even number in the integer list which is greater than 3.");
        Optional<Integer> optionalInteger=list.stream().filter(e->e>3).filter(e-> e%2==0).findFirst();
        if(optionalInteger.isPresent()){
            System.out.println(optionalInteger.get());
        }
        else System.out.println("no such number");
    }
}
