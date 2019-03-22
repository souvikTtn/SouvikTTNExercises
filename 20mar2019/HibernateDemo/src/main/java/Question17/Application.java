package Question17;

import Entity.AuthorEntity13;
import Entity.BookEntity3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        AuthorEntity13 author1=new AuthorEntity13();
        author1.setFirstName("souvik");
        author1.setLastName("chakraborty");
        author1.setAge(25);
        BookEntity3 book=new BookEntity3();
        book.setBookName("champak");
        BookEntity3 book1=new BookEntity3();
        book1.setBookName("nandan");
        BookEntity3 book2=new BookEntity3();
        book2.setBookName("tinkle");
        List<BookEntity3> books= Arrays.asList(book,book1,book2);
        author1.setBooks(books);


        AuthorEntity13 author2=new AuthorEntity13();
        author2.setFirstName("subham");
        author2.setLastName("chakraborty");
        author2.setAge(26);
        author2.setBooks(books);




        AuthorEntity13 author3=new AuthorEntity13();
        author3.setFirstName("deepika");
        author3.setLastName("tiwari");
        author3.setAge(27);
        author3.setBooks(books);

        List<AuthorEntity13> authors=Arrays.asList(author1,author2,author3);
        book.setAuthors(authors);
        book1.setAuthors(authors);
        book2.setAuthors(authors);



        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.persist(author1);
        session.persist(author2);
        session.persist(author3);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
