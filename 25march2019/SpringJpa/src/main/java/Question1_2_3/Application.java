package Question1_2_3;

import jpaDemo.Repositories.PersonRepo;
import jpaDemo.Service.PersonService;
import jpaDemo.entity.PersonEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        PersonService personService=context.getBean("personService",PersonService.class);

        PersonEntity personEntity=context.getBean("personEntity",PersonEntity.class);

        PersonRepo personRepo=context.getBean("personRepo",PersonRepo.class);

        personEntity.setFirstName("souvik");
        personEntity.setLastName("chakraborty");
        personEntity.setAge(24);
        personEntity.setSalary(31000d);

        //creating the data in the database
        personService.insertPerson(personEntity);

        //reading the data form the database
        Iterable<PersonEntity> persons=personService.getAllPerson();
        persons.forEach(e-> System.out.println(e));

        //exists method
        int id=personEntity.getId();
        System.out.println("wheter the person with id exists or not "+id);
        System.out.println(personRepo.exists(id));

        //saves all the list of users
        PersonEntity personEntity1=context.getBean("personEntity",PersonEntity.class);
        personEntity1.setFirstName("subham");
        personEntity1.setLastName("chakraborty");
        personEntity1.setAge(24);
        personEntity1.setSalary(31000d);
        PersonEntity personEntity2=context.getBean("personEntity",PersonEntity.class);
        personEntity2.setFirstName("deepika");
        personEntity2.setLastName("tiwari");
        personEntity2.setAge(24);
        personEntity2.setSalary(31000d);
        PersonEntity personEntity3=context.getBean("personEntity",PersonEntity.class);
        personEntity3.setFirstName("dhruv");
        personEntity3.setLastName("oberoi");
        personEntity3.setAge(24);
        personEntity3.setSalary(31000d);
        PersonEntity personEntity4=context.getBean("personEntity",PersonEntity.class);
        personEntity4.setFirstName("divya");
        personEntity4.setLastName("arora");
        personEntity4.setAge(24);
        personEntity4.setSalary(31000d);
        PersonEntity personEntity5=context.getBean("personEntity",PersonEntity.class);
        personEntity5.setFirstName("deepak");
        personEntity5.setLastName("bisht");
        personEntity5.setAge(24);
        personEntity5.setSalary(31000d);

        Iterable<PersonEntity> personEntities=new ArrayList<>();
        ((ArrayList<PersonEntity>) personEntities).add(personEntity1);
        ((ArrayList<PersonEntity>) personEntities).add(personEntity2);
        ((ArrayList<PersonEntity>) personEntities).add(personEntity3);
        ((ArrayList<PersonEntity>) personEntities).add(personEntity4);
        ((ArrayList<PersonEntity>) personEntities).add(personEntity5);
        personRepo.save(personEntities);




        //updating the data from the database
        personEntity.setFirstName("souvikdgreat");
        personService.insertPerson(personEntity);

        //getting only one record from the database
        System.out.println("person whose id is s is ");
        PersonEntity p=personRepo.findOne(2);
        System.out.println(p);

        //counting the records from the database
        System.out.println("the no of entries in the database is "+ personRepo.count());

        //delete the data from the database
        //personService.deletePerson(personEntity);

        //delete all data from database
       // personRepo.deleteAll();

    }
}
