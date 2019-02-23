package CollectionsAndDates.Question3;

import java.util.HashMap;
import java.util.Map;

/*Write a method that takes a string and print the number of occurrence of each character characters in the string.*/
public class Main {
    public static void main(String[] args) {
        String myString="hello this is my String with duplicate characters";
        Map<Character,Integer> myMap=getOccuranceOfChar(myString);
        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static Map<Character,Integer> getOccuranceOfChar(String myString){
        Map<Character,Integer> myMap=new HashMap<>();
        for(int i=0;i<myString.length();i++){
            if(myMap.containsKey(myString.charAt(i))){
                int count=myMap.get(myString.charAt(i));
                myMap.put(myString.charAt(i),count+1);
            }
            else {
                myMap.put(myString.charAt(i),1);
            }
        }
        //System.out.println(myMap);
        return myMap;
    }
}
