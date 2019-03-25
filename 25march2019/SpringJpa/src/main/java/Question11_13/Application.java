package Question11_13;

import jpaDemo.Repositories.PersonRepo;
import jpaDemo.entity.PersonEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        PersonRepo personRepo=context.getBean("personRepo",PersonRepo.class);
           List<PersonEntity> personEntities= personRepo.findByAgeGreaterThanOrderByIdDesc(23);

           for (PersonEntity personEntity:personEntities)
               System.out.println(personEntity);

        System.out.println("Pagination example");
        Page<PersonEntity> personEntityPage=personRepo.findByAgeGreaterThanOrderByIdDesc(23,new PageRequest(0,3));
        List<PersonEntity> personEntities1=personEntityPage.getContent();
        for (PersonEntity personEntity:personEntities1){
            System.out.println(personEntity);
        }


    }
}
