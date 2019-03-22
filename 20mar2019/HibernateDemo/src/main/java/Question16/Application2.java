package Question16;

import Entity.AuthorEntity11;
import Entity.BookEntity1;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;


public class Application2 {
    public static void main(String[] args) {

        AuthorEntity11 author=new AuthorEntity11();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        BookEntity1 book=new BookEntity1();
        book.setBookName("champak");
        book.setAuthor(author);
        BookEntity1 book1=new BookEntity1();
        book1.setBookName("nandan");
        book1.setAuthor(author);
        BookEntity1 book2=new BookEntity1();
        book2.setBookName("tinkle");
        book2.setAuthor(author);
        List<BookEntity1> books= Arrays.asList(book,book1,book2);
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


