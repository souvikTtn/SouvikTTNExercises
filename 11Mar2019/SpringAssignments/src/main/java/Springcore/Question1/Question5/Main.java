package Springcore.Question1.Question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringConfiguration.xml");
        Complex complex=applicationContext.getBean("complexBean",Complex.class);

        List list=complex.getList();
        Set set=complex.getSet();
        Map map=complex.getMap();

        System.out.println("list contents");
        System.out.println(list);

        System.out.println("set contents");
        System.out.println(set);

        System.out.println("map contents");
        System.out.println(map);
    }
}
