package SpringDataAssignment.Question3_1;

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
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData.xml");
        DataSourceDemo dataSourceDemo=applicationContext.getBean("dataSourceDemo", DataSourceDemo.class);
        try {
            dataSourceDemo.getUserDao().printUserNames();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
