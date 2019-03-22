package Question3;

import Entity.AuthorEntity2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {

        AuthorEntity2 author=new AuthorEntity2();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);

        AuthorEntity2 author2=new AuthorEntity2();
        author2.setFirstName("subham");
        author2.setLastName("chakraborty");
        author2.setAge(20);

        SimpleDateFormat format =new SimpleDateFormat("dd-MM-YYYY");
        Calendar calendar=Calendar.getInstance();
        calendar.set(1998,9,3);
        Date date=calendar.getTime();
        author2.setDob(date);


        SessionFactory sessionFactory=new Configuration().configure("hibernate2.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.save(author2);
        session.getTransaction().commit();



        //closing the session and session factory
        session.close();
        sessionFactory.close();
    }
}
