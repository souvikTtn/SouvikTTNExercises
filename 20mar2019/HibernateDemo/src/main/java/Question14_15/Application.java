package Question14_15;

import Entity.AuthorEntity8;
import Entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {

        AuthorEntity8 author=new AuthorEntity8();
        author.setAge(24);
        author.setFirstName("souvik");
        author.setLastName("chakraborty");

        Book book=new Book();
        book.setBookName("champak");
        author.setBook(book);
        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.save(author);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
