package MultiThreading.Question2;

public class MyThread2 extends Thread{
    public void run(){
        for (int i=0;i<3;i++)
            System.out.println("thread by extending thread class");
    }
}
