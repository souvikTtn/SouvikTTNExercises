package MultiThreading.Question10;

public class MyThread implements Runnable {
    PrintTable printTable;
    int number;
    MyThread(PrintTable printTable,int number){
        this.printTable=printTable;
        this.number=number;
    }
    @Override
    public void run() {

        printTable.displayTable(number);
    }
}
