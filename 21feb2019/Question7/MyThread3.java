package MultiThreading.Question7;

import java.util.concurrent.Callable;

public class MyThread3 implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("Thread 3 executing");
        return 3;
    }
}
