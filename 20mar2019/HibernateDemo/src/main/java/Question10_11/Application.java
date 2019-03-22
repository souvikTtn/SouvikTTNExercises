package Question10_11;

import Entity.Address;
import Entity.AuthorEntity6;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Application {
    public static void main(String[] args) {
        AuthorEntity6 author=new AuthorEntity6();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAuthorId(1);
        author.setAge(24);
        Address address=new Address();
        address.setState("uttar pradesh");
        address.setStreetNumber("shalimar garden");
        address.setLocation("ghaziabad");
        author.setAddress(address);

        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();


    }
}
