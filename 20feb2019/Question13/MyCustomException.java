package java2Exercise.Question13;

public class MyCustomException extends Exception {
    MyCustomException(String expMsg){
        super(expMsg);
    }
   public Throwable fillInStackTrace(){
       return this;
   }
}

