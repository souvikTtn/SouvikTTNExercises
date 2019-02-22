/*Use a singleThreadExecutor to submit multiple threads.*/
package MultiThreading.Question3_4And5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Runnable runnable1=new MyThread1();
        Runnable runnable2=new MyThread2();
        Runnable runnable3=new MyThread3();
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        try{
            executorService.submit(runnable1);
            System.out.println("executor shutdown "+executorService.isShutdown());
            System.out.println("task terminated "+executorService.isTerminated());

            executorService.submit(runnable2);
            executorService.submit(runnable3);
           // executorService.shutdownNow();
            System.out.println("task terminated "+executorService.isTerminated());
        }
        finally {
            executorService.shutdown();
            //executorService.shutdownNow();
        }
        System.out.println("executor shutdown "+executorService.isShutdown());
        System.out.println("task terminated "+executorService.isTerminated());
    }
}
