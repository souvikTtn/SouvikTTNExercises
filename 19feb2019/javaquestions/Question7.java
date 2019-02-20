/*Write a program to print your Firstname,LastName & age using static block,static method & static variable respectively*/
package javaquestions;

public class Question7 {
    static String firstName;
    static String lastName;
    static int age=25;
    static{
        firstName="souvik";
        System.out.println("first name is "+firstName);
    }
    static void lastName(){
        lastName="chakraborty";
        System.out.println("last name is "+lastName);
    }
    public static void main(String []args)
    {
        Question7.lastName();
        System.out.println("age is "+Question7.age);
    }
}
