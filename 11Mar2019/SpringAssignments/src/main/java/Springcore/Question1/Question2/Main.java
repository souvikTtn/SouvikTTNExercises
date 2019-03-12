package Springcore.Question1.Question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        Database database=applicationContext.getBean("database",Database.class);
        database.setName("MongoDb");
        database.setPort(3383);
        System.out.println(" name "+database.getName()+" port no "+database.getPort());
    }
}
