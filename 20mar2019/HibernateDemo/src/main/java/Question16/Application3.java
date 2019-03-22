package Question16;

import Entity.AuthorEntity12;
import Entity.BookEntity2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        AuthorEntity12 author=new AuthorEntity12();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);
        BookEntity2 book=new BookEntity2();
        book.setBookName("champak");
        book.setAuthor(author);
        BookEntity2 book1=new BookEntity2();
        book1.setBookName("nandan");
        book1.setAuthor(author);
        BookEntity2 book2=new BookEntity2();
        book2.setBookName("tinkle");
        book2.setAuthor(author);
        List<BookEntity2> books= Arrays.asList(book,book1,book2);
        author.setBooks(books);



        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.persist(author);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
