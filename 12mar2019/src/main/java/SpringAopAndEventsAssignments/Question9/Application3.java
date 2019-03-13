package SpringAopAndEventsAssignments.Question9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application3 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringEvent3.xml");

        MyNewService myNewService=applicationContext.getBean("myNewService",MyNewService.class);
        myNewService.method1(1,"hello");
    }
}
