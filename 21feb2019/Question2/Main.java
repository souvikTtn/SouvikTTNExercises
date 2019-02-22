/*using sleep and join method*/
package MultiThreading.Question2;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread t1=new Thread(new MyThread());
        Thread t2=new MyThread2();
        t1.start();
        t1.sleep(2000l);
        //t1.join();
        t2.start();
        t2.sleep(1000l);
        t1.join();
        t2.join();
        for(int i=0;i<3;i++)
            System.out.println("main thread");
    }
}
