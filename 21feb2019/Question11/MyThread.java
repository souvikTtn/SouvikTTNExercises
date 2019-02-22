package MultiThreading.Question11;

import MultiThreading.Question10.PrintTable;

public class MyThread implements Runnable {
    PrintTable printTable;
    int number;
    MyThread(PrintTable printTable, int number){
        this.printTable=printTable;
        this.number=number;
    }
    @Override
    public void run() {
        synchronized (printTable){
            printTable.displayTable(number);
        }
    }
}
