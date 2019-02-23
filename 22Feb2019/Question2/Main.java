package CollectionsAndDates.Question2;
//Write a method that takes a string and returns the number of unique characters in the string.
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String myString="hello this is my String with duplicate characters";
        int uniqueChars=noOfUniqueChar(myString);
        System.out.println(uniqueChars);
    }
    public static int noOfUniqueChar(String myString){
        Set<Character> mySet=new LinkedHashSet<>();
        /*checking if the string has blank char*/
        for(int i=0;i<myString.length();i++){
            if(myString.charAt(i)!=' ')
            mySet.add(myString.charAt(i));
        }
        System.out.println("unique chars "+mySet);
        return mySet.size();
    }
}
