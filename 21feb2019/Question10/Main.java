package MultiThreading.Question10;

import MultiThreading.Question8.MyThread1;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        PrintTable  printTable=new PrintTable();
        Thread thread1=new Thread(new MyThread(printTable,2));
        Thread thread2=new Thread(new MyThread(printTable,4));
        thread1.start();
        thread2.start();

    }
}
