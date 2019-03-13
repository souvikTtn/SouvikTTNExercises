package SpringAopAndEventsAssignments.Question1And2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventsDemo {
    public void myMethod(){
        System.out.println("my method invoked");
    }
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringEvents.xml");

        applicationContext.start();

        EventsDemo eventsDemo=applicationContext.getBean("eventsDemo",EventsDemo.class);
        eventsDemo.myMethod();

        applicationContext.stop();

        applicationContext.close();
    }
}
