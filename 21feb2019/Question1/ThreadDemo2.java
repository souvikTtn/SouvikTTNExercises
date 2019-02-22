//creating thread by implementing runnable interface
package MultiThreading.Question1;

public class ThreadDemo2 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++)
            System.out.println("thread using Runnable interface");
    }
}
