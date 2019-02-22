package MultiThreading.Question7;

import java.util.concurrent.Callable;

public class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() {
        System.out.println("Thread 2 executing");
        return 2;
    }
}
