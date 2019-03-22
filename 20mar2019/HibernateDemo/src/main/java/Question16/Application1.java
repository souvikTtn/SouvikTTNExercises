package Question16;

import Entity.AuthorEntity10;
import Entity.BookEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;


public class Application1 {
    public static void main(String[] args) {

        AuthorEntity10 author=new AuthorEntity10();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        BookEntity book=new BookEntity();
        book.setBookName("champak");
        book.setAuthor(author);
        BookEntity book1=new BookEntity();
        book1.setBookName("nandan");
        book1.setAuthor(author);
        BookEntity book2=new BookEntity();
        book2.setBookName("tinkle");
        book2.setAuthor(author);
        List<BookEntity> books= Arrays.asList(book,book1,book2);
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


