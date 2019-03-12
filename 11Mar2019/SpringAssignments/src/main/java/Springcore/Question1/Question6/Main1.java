package Springcore.Question1.Question6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringAutoWireByType.xml");
        Restaurant restaurant=applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareDrink();
    }
}
