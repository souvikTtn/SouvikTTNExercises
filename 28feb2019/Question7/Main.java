package Java8.Question7;
interface MyInterface{
     default void defaultMethod(){
        System.out.println("interface default method");
    }
}
public class Main implements MyInterface{
    public void defaultMethod(){
        System.out.println("overidden interface default method");
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.defaultMethod();
    }
}
