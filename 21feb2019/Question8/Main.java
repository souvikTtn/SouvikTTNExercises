package MultiThreading.Question8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executorService= Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleWithFixedDelay(new MyThread2(),0,2,TimeUnit.SECONDS);
        executorService.scheduleAtFixedRate(new MyThread1(),0,1, TimeUnit.SECONDS);
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            executorService.shutdown();
        }
    }
}
