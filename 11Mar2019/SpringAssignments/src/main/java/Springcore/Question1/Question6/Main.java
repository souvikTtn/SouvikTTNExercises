package Springcore.Question1.Question6;

import Springcore.Question1.Question3And4.Restaurant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringAutoWire.xml");
        Restaurant restaurant=applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareDrink();
    }
}
