package Question4;

import Entity.AuthorEntity2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {


        Calendar calendar=Calendar.getInstance();
        Date date;

        SessionFactory sessionFactory=new Configuration().configure("hibernate3.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        AuthorEntity2 author1=new AuthorEntity2();
        author1.setFirstName("DHRUV");
        author1.setLastName("OBEROI");
        author1.setAge(24);
        session.save(author1);

        AuthorEntity2 author2=new AuthorEntity2();
        author2.setFirstName("DEEPIKA");
        author2.setLastName("TIWARI");
        author2.setAge(26);


        calendar.set(1992,9,3);
        date=calendar.getTime();
        author2.setDob(date);
        session.save(author2);

        AuthorEntity2 author3=new AuthorEntity2();
        author3.setFirstName("divya");
        author3.setLastName("arora");
        author3.setAge(24);
        calendar.set(1994,5,5);
        date=calendar.getTime();
        author3.setDob(date);
        session.save(author3);

        AuthorEntity2 author4=new AuthorEntity2();
        author4.setFirstName("deepak");
        author4.setLastName("bisht");
        author4.setAge(25);
        calendar.set(1995,3,10);
        date=calendar.getTime();
        author4.setDob(date);
        session.save(author4);


        session.getTransaction().commit();

        //closing the session and session factory
        session.close();
        sessionFactory.close();
    }
}
