package SpringDataAssignment.Question6;

import SpringDataAssignment.Question5.UserDaoNew;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData6.xml");
       UserDao userDao=applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao.getUserName());

    }
}
