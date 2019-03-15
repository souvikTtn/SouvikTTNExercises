package SpringDataAssignment.Question4;

import SpringDataAssignment.Question3_1.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class DataSourceDemo {

    @Autowired
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData3.xml");
        DataSourceDemo dataSourceDemo=applicationContext.getBean("dataSourceDemo", DataSourceDemo.class);
        try {
            dataSourceDemo.getUserDao().printUserNames();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
