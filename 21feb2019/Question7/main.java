package MultiThreading.Question7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.ScheduledExecutorService;

public class main {
    public static void main(String[] args) {
        List<Callable<Integer>> runnables=new ArrayList<>();
        boolean result=false;
        runnables.add(new MyThread1());
        runnables.add(new MyThread2());
        runnables.add(new MyThread3());
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        try {
             executorService.invokeAll(runnables);
             executorService.shutdown();
             executorService.awaitTermination(1000l, TimeUnit.MICROSECONDS);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        if(executorService.isTerminated())
            System.out.println("terminated");
        else System.out.println("one or more tasks till remaining");
    }
}
