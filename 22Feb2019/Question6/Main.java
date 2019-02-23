package CollectionsAndDates.Question6;

/*Print the elements of an array in the decreasing frequency
        if 2 numbers have same frequency then print the one which came first.*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int []myArray={4,4,4,4,1,2,3,3,5,5,5,5,5,1,2,3,};
        Map<Integer,Integer> myMap=new HashMap<>();

        for(int i=0;i<myArray.length;i++){
            if(myMap.containsKey(myArray[i])){
                myMap.put(myArray[i],myMap.get(myArray[i])+1);
            }
            else myMap.put(myArray[i],1);
        }

        Set<Map.Entry<Integer, Integer>> entries=myMap.entrySet();
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(myMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });
        System.out.println(list);
        System.out.println("set "+entries);

        //sorted map

        System.out.println("the sorted map based on occurance ");
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        System.out.println(temp);

    }
}
