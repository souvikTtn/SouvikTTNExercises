package Question1_2;

import Entity.AuthorEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


//CRUD operations

public class Application {
    public static void main(String[] args) {

        AuthorEntity author=new AuthorEntity();
        author.setFirstName("souvik");
        author.setLastName("chakraborty");
        author.setAge(24);

        AuthorEntity author2=new AuthorEntity();
        author2.setFirstName("subham");
        author2.setLastName("chakraborty");
        author2.setAge(20);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();

        //saving the records
        session.save(author);
        session.save(author2);

        //Reading the records
        AuthorEntity authorEntity=session.get(AuthorEntity.class,"souvik");

        System.out.println("-----------------------------------------------");
        System.out.println("the records fetched from the db are");
        System.out.println("Author first name "+authorEntity.getFirstName());
        System.out.println("Author last name "+authorEntity.getLastName());
        System.out.println("Age of the author "+authorEntity.getAge());
        System.out.println("-----------------------------------------------");

        //updating the record in the database
        AuthorEntity authorEntity1=session.get(AuthorEntity.class,"souvik");
        authorEntity1.setLastName("Chakraborty");
        authorEntity1.setAge(25);
        session.update(authorEntity1);

        //deleting a particular record
        session.delete(author2);

        session.getTransaction().commit();
        //closing the session and session factory
        session.close();
        sessionFactory.close();

    }
}
