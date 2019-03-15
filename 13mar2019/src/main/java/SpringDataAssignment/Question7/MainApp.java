package SpringDataAssignment.Question7;

import SpringDataAssignment.Question6.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData6.xml");
       UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
       User user=new User();
       user.setAge(26);
       user.setDob(new Date());
       user.setName("deepak");
       user.setPassword("deepak");
       user.setUsername("rcBumbleb");
       userDao.insertUser(user);
    }
}
