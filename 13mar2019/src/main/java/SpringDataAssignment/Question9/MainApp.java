package SpringDataAssignment.Question9;

import SpringDataAssignment.Question6.UserDao;
import SpringDataAssignment.Question7.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData6.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        userDao.queryForMapDemo();
    }
}
