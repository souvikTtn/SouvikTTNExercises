package MultiThreading.Question9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//using
public class Main2 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        for(int i=0;i<10;i++){

            executorService.submit(new MyThread(i));
        }
        executorService.shutdown();
    }
}
