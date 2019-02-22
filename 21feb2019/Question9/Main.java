package MultiThreading.Question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //using cached  thread pool
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){

            executorService.submit(new MyThread(i));
        }
        executorService.shutdown();
    }
}
