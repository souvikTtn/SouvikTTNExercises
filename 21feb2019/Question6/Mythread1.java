package MultiThreading.Question6;

import java.util.concurrent.Callable;

public class Mythread1 implements Callable<Integer> {
    public Integer call(){
        System.out.println("Thread");
        return 1;
    }
}
