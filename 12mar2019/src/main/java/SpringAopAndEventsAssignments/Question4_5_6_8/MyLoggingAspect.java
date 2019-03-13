package SpringAopAndEventsAssignments.Question4_5_6_8;

import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class MyLoggingAspect {

    @Before("displayPointcut()")
      void beforeAdvice(){
        System.out.println("before invoking of the method");
    }

    @After("displayPointcut()")
    void afterAdvice(){
        System.out.println("after invoking of the method");
    }

    @AfterThrowing(pointcut = "execution(* * ())", throwing = "ex")
    void afterReturningAdvice(IOException ex) {
        System.out.println("Running AfterThrowing " + ex.getMessage());
    }



    @Pointcut("within(SpringAopAndEventsAssignments.Question4_5_6_8.MyClassService)")
    void displayPointcut(){}
}
