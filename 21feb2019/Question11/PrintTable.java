package MultiThreading.Question11;

public class PrintTable {
    public synchronized void displayTable(int number) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(number * i+" "+Thread.currentThread().getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
