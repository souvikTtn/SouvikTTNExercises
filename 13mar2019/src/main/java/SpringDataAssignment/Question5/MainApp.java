package SpringDataAssignment.Question5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData.xml");
        UserDaoNew userDao=applicationContext.getBean("userDaoNew", UserDaoNew.class);
        System.out.println("the number of the users is "+userDao.getCount());
    }
}
