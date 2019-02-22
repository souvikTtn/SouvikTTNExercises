package MultiThreading.Question6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        List<Callable<Integer>>runnables=new ArrayList<>();
        runnables.add(new Mythread1());
        runnables.add(new MyThread2());
        runnables.add(new MyThread3());
        List<Future<Integer>> futureList=executorService.invokeAll(runnables);

        try {
            /*using for Each Loop*/
            for(Future<Integer> future:futureList){
                if(future.isDone())
                    System.out.println("task completed");
                if(future.isCancelled())
                    System.out.println("task not completed");
                System.out.println("return value "+future.get());
            }

            /*using for loop*/
            for (int i=0;i<futureList.size();i++)
                System.out.println(futureList.get(i).get());
        }
        catch (ExecutionException e){
            System.out.println(e.getStackTrace());
        }
        finally {
            executorService.shutdown();
        }
    }
}
