package Java8.Question3;

@FunctionalInterface
interface MyFunctionalInterface{
    int myFunction(int a,int b);
}

public class Main {
    public int addNumbers(int a,int b){
        return (a+b);
    }
    public int subtractNumbers(int a,int b){
        return (a-b);
    }
    static public int multiplyNumbers(int a,int b){
        return (a*b);
    }

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface=new Main()::addNumbers;
        MyFunctionalInterface myFunctionalInterface2=new Main()::subtractNumbers;
        MyFunctionalInterface myFunctionalInterface3=Main::multiplyNumbers;
        System.out.println(myFunctionalInterface.myFunction(3,4));
        System.out.println(myFunctionalInterface2.myFunction(3,4));
        System.out.println(myFunctionalInterface3.myFunction(3,4));
       // System.out.println(myFunctionalInterface.myFunction(3,4));
    }
}
