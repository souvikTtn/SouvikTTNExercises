package Question6;

import jpaDemo.Repositories.PersonRepo;
import jpaDemo.entity.PersonEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        PersonRepo personRepo=context.getBean("personRepo",PersonRepo.class);

        List<PersonEntity> personEntities=personRepo.customFindByAge(24);
        for (PersonEntity personEntity:personEntities){
            System.out.println(personEntity.getId()+" "+personEntity.getFirstName()+" "+personEntity.getSalary()+" "+personEntity.getAge());
        }
    }
}
