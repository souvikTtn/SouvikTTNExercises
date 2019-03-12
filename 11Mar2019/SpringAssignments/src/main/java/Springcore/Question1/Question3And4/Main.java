package Springcore.Question1.Question3And4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        Restaurant restaurant=applicationContext.getBean("teaRestaurant",Restaurant.class);
        HotDrink tea=applicationContext.getBean("tea",Tea.class);

        tea.prepareDrink();
        restaurant.getHotDrink().prepareDrink();

        HotDrink expressTea=applicationContext.getBean("expressTea",ExpressTea.class);
        expressTea.prepareDrink();
        restaurant.getHotDrink2().prepareDrink();
    }
}
