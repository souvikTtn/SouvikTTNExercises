package MultiThreading.Question6;

import java.util.concurrent.Callable;

public class MyThread3 implements Callable<Integer> {
    public Integer call(){
        System.out.println("Thread 3");
        return 3;
    }
}
