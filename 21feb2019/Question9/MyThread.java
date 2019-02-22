package MultiThreading.Question9;

public class MyThread implements Runnable {
    int id;
    MyThread(int id){
        this.id=id;
    }
    public void run(){

        System.out.println("Thread name :"+Thread.currentThread().getName()+" id is ::"+id);
    }
}
