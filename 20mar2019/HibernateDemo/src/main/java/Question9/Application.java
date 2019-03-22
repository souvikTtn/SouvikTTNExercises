package Question9;
import Entity.AuthorEntity5;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {


        Calendar calendar=Calendar.getInstance();
        Date date;
        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        AuthorEntity5 author=new AuthorEntity5();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        calendar.set(1994,9,16);
         date=calendar.getTime();
        author.setDate(date);
        session.save(author);

        AuthorEntity5 author1=new AuthorEntity5();
        author1.setFirstName("subham");
        author1.setLastName("chakraborty");
        author1.setAge(20);
        calendar.set(1998,9,3);
        date=calendar.getTime();
        author1.setDate(date);
        session.save(author1);

        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
