package SpringAopAndEventsAssignments.Question9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("within(SpringAopAndEventsAssignments.Question9.MyNewService)")
    void beforeAdvice(JoinPoint joinPoint){
        System.out.println("before advice executed");
        System.out.println(joinPoint.getSignature());
        for (Object obj:joinPoint.getArgs()){
            System.out.println(obj);
        }
    }

}
