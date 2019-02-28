package Java8.Question2;
@FunctionalInterface
interface MyFunctionalInterface{
    int myFunction(int a,int b);
}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface=(a,b)->a;
        System.out.println(myFunctionalInterface.myFunction(1,2));
    }
}
