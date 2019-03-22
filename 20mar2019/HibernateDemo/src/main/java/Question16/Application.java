package Question16;

import Entity.AuthorEntity9;
import Entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        AuthorEntity9 author=new AuthorEntity9();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        Book book=new Book();
        book.setBookName("champak");
        Book book1=new Book();
        book1.setBookName("nandan");
        Book book2=new Book();
        book2.setBookName("tinkle");
        List<Book> books= Arrays.asList(book,book1,book2);
        author.setBooks(books);


        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(book);
        session.save(book1);
        session.save(book2);
        session.save(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }

}


