package Question12_13;

import Entity.AuthorEntity7;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class Application {
    public static void main(String[] args) {

        AuthorEntity7 author=new AuthorEntity7();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        List<String> subjects=author.getSubject();
        subjects.add("english");
        subjects.add("physics");
        subjects.add("maths");
        author.setSubject(subjects);

        AuthorEntity7 author1=new AuthorEntity7();
        author1.setFirstName("subham");
        author1.setLastName("chakraborty");
        author1.setAge(24);
        author1.setSubject(subjects);



        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        session.save(author);
        session.save(author1);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
