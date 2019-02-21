package java2Exercise.Question13;

public class Main {
public static void main(String []args){
    try
    {
        // Throw an object of user defined exception
        throw new MyCustomException("MY Custom Exception");
    }
    catch (MyCustomException e)
    {
        System.out.println("Caught");
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}
}
