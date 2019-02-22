package MultiThreading.Question6;

import java.util.concurrent.Callable;

public class MyThread2 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Thread 2");
        return 2;
    }
}
