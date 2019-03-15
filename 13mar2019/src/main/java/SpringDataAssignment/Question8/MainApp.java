package SpringDataAssignment.Question8;

import SpringDataAssignment.Question6.UserDao;
import SpringDataAssignment.Question7.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData6.xml");
        UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        List<User> list=userDao.getListOfUsers();
        System.out.println(list);
    }
}
