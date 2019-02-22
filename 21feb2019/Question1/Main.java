package MultiThreading.Question1;

public class Main {
    public static void main(String []args){
        Thread threadDemo=new ThreadDemo();
        threadDemo.start();
        Thread thread=new Thread(new ThreadDemo2());
        thread.start();
        for(int i=0;i<5;i++)
            System.out.println("main thread");

    }
}
