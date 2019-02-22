package MultiThreading.Question7;

import java.util.concurrent.Callable;

public class MyThread1 implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("Thread 1 executing");
        return 1;
    }
}
