package Springcore.Question1.Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringAutowireByConstructor.xml");
        Restaurant2 restaurant=applicationContext.getBean("restaurant",Restaurant2.class);
        restaurant.getHotDrink().prepareDrink();
    }
}
