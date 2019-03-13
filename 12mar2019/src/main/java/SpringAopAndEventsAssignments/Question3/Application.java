package SpringAopAndEventsAssignments.Question3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringEvent2.xml");
        CustomEventPublisher customEventPublisher=applicationContext.getBean("customEventPublisher",CustomEventPublisher.class);
        customEventPublisher.display();
    }
}
