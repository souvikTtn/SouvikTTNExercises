package Question7_8;

import Entity.AuthorEntity4;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;


public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        AuthorEntity4 author=new AuthorEntity4();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);

        Calendar calendar=Calendar.getInstance();
        calendar.set(1994,9,16);
        Date date=calendar.getTime();
        author.setDate(date);
        session.save(author);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }

}
