package Question5;

import Entity.AuthorEntity3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {

        SessionFactory sessionFactory=new Configuration().configure("hibernate4.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        AuthorEntity3 author=new AuthorEntity3();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();

        //the schema will be deleted after the session factory is closed explicitly
    }
}
