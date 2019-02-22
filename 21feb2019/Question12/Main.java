package MultiThreading.Question12;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    AtomicInteger count= new AtomicInteger();
    public void incrementCount() {
            count.incrementAndGet();
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }
    public static void main(String[] args) throws InterruptedException {

        Main main = new Main();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(main.count);
    }

}
