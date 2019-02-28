package Java8.Question8;
interface MyInterface{
    default void defaultMethod() {
        System.out.println("interface default method");
    }
}
interface MyInterface1 extends MyInterface{
    default void defaultMethod(){
        System.out.println("child interface default method");
    }
}
public class Main implements MyInterface,MyInterface1{
    public void defaultMethod(){
        MyInterface1.super.defaultMethod();
    }
    public static void main(String[] args) {
        Main main=new Main();
        main.defaultMethod();
    }
}
