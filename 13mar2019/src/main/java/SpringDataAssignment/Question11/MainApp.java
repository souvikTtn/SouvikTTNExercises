package SpringDataAssignment.Question11;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

@Repository
public class MainApp {
    @Autowired
    SessionFactory sessionFactory;

    public void sessionFactoryDemo() {

        String sql = "SELECT COUNT(*) FROM User";
         Query query = sessionFactory.openSession().createQuery(sql);

         /*since no primary key is given it will return all the result*/

        System.out.println(query.uniqueResult());
        sessionFactory.close();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData11.xml");
        MainApp mainApp=applicationContext.getBean("mainApp", MainApp.class);
        mainApp.sessionFactoryDemo();
    }
}

