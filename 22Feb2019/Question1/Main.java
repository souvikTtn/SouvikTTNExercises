package CollectionsAndDates.Question1;
/*Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
find the sum of the numbers in List.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> floatList=new ArrayList<>();
        float sum=0;
        floatList.add(123f);
        floatList.add(128.00f);
        floatList.add(13.50f);
        floatList.add(124f);
        floatList.add(123.55f);
        Iterator <Float>iterator=floatList.iterator();
        /*printing the list*/
        while (iterator.hasNext()){
            float temp=iterator.next();
            System.out.println(temp);
            sum+=temp;
        }
        System.out.println("the sum  of the elements in the list is ::"+sum);
    }
}
