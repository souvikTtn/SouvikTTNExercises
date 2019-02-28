package Java8.Question6;

interface MyInterface{
    default void defaultMethod(){
        System.out.println("interface default method");
    }
     static void defaultStaticMethod(){
         System.out.println("interface static method");
    }
}
public class Main implements MyInterface{
    public static void main(String[] args) {
        MyInterface.defaultStaticMethod();
        Main main=new Main();
        main.defaultMethod();
    }
}
