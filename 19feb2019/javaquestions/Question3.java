/*find the occurance of each character in a string*/
package javaquestions;

public class Question3 {
    public static void main(String[] args) {
            String str="hello world from java";
            //counting the no occurances of l in the string
            String temp=str.replace("l","");
       // System.out.println(temp);
        System.out.println("the no of occurances of l in the string is : "+(str.length()-temp.length()));
    }
}

