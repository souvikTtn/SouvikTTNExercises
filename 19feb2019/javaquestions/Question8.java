/*Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer*/
package javaquestions;

public class Question8 {
    public static void main(String[] args) {
        String myString="hello world from java";
        System.out.println(myString);
        String tempString="";
        for(int i=myString.length()-1;i>=0;i--)
            tempString+=myString.charAt(i);
        System.out.println(tempString);
       /* for(int i=4;i<=9;i++)
        {
            String temp=new String();
           // System.out.println(tempString.charAt(i));
           // temp=tempString.replace(tempString.charAt(i),' ');
            //tempString=temp;
            System.out.println(temp);
        }*/
       String temp=tempString.replace(tempString.substring(4,10)," ");
       System.out.println(temp);
       StringBuffer sb=new StringBuffer(temp);
       sb.reverse();
        System.out.println("reversed string is ::"+sb);

    }
}
