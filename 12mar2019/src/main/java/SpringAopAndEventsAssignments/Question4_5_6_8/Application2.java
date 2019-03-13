package SpringAopAndEventsAssignments.Question4_5_6_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;


public class Application2 {
    public static void main(String[] args)  {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringEvent3.xml");
        MyClassService myClassService=applicationContext.getBean("myClassService",MyClassService.class);
        myClassService.method1();

        myClassService.method2();

        myClassService.method3();

        myClassService.method4();

        try {
            myClassService.method5();
        } catch (IOException e) {
            System.out.println("Exception caught");
        }
    }
}
