package SpringAopAndEventsAssignments.Question7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring-config.xml");
        Demo demo=applicationContext.getBean(Demo.class);
        demo.test(1);
    }

}
