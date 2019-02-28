package java2Exercise.Question3;

public class ClassNotFoundExDemo {
    public static void main(String []args){
        try{
            Class.forName("DummyClass");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}

