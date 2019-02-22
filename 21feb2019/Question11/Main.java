package MultiThreading.Question11;

import MultiThreading.Question10.PrintTable;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        PrintTable  printTable=new PrintTable();
        Thread thread1=new Thread(new MultiThreading.Question11.MyThread(printTable,2));
        Thread thread2=new Thread(new MyThread(printTable,4));
        thread1.start();
        thread2.start();

    }
}
