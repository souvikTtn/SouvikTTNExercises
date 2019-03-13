package SpringAopAndEventsAssignments.Question4_5_6_8;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MyClassService {

    public void method1(){
        System.out.println("m1 method of service is invoked");
    }

    public void method2(){
        System.out.println("m2 method of service is invoked");
    }

    public void method3(){
        System.out.println("m3 method of service is invoked");
    }

    public void method4(){
        System.out.println("m4 method of service is invoked");
    }

    public void method5() throws IOException {
        System.out.println("exception throwable method");
        throw new IOException();
    }
}
