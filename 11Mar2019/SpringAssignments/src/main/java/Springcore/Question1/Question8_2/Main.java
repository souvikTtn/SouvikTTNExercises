package Springcore.Question1.Question8_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringAutowiredConstructor.xml");
        Restaurant restaurant=applicationContext.getBean("restaurant",Restaurant.class);
        restaurant.getHotDrink().prepareDrink();

    }
}