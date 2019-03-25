package Question4_5;

import jpaDemo.Repositories.PersonRepo;
import jpaDemo.entity.PersonEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
        PersonRepo personRepo2=context.getBean("personRepo",PersonRepo.class);
        List<PersonEntity>personEntities=personRepo2.findPersonEntitiesByFirstName("souvikdgreat");
        System.out.println(personEntities);

        List<PersonEntity>personEntities2=personRepo2.findPersonEntitiesByLastName("chakraborty");
        System.out.println(personEntities2);

        PersonEntity personEntities3=personRepo2.findPersonEntitiesById(2);
        System.out.println(personEntities3);
    }
}
