//creating a thread by extending the thread class
package MultiThreading.Question1;

public class ThreadDemo extends Thread {
    public void run(){
        for(int i=0;i<5;i++)
        System.out.println("thread using Thread class");
    }
}
