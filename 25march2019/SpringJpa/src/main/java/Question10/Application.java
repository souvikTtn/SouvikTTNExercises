package Question10;

import jpaDemo.Repositories.PersonRepo;
import jpaDemo.entity.PersonEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        PersonRepo personRepo=context.getBean("personRepo",PersonRepo.class);

        System.out.println(personRepo.count());

        List<PersonEntity> personEntities=personRepo.findDistinctByFirstName("souvikdgreat");
        System.out.println(personEntities);

        List<PersonEntity> personEntities1=personRepo.findByFirstNameIsLike("d%");
        System.out.println(personEntities1);

        List<PersonEntity> personEntities2=personRepo.findByFirstNameOrAge("souvikdgreat",23);
        System.out.println(personEntities2);

        List<PersonEntity> personEntities3=personRepo.findByFirstNameAndAge("souvikdgreat",24);
        System.out.println(personEntities3);

        List<PersonEntity>personEntities4=personRepo.findByAgeBetween(22,24);
        System.out.println(personEntities4);

        List<PersonEntity>personEntities5=personRepo.findByAgeGreaterThan(23);
        System.out.println(personEntities5);

        List<PersonEntity>personEntities6=personRepo.findByAgeLessThan(22);
        System.out.println(personEntities6);

        List<PersonEntity>personEntities7=personRepo.findByFirstNameNot("souvikdgreat");
        System.out.println(personEntities7);

        List<String> nameList= Arrays.asList("souvikdgreat","deepika","dhruv");
        List<PersonEntity> personEntities8=personRepo.findByFirstNameIn(nameList);
        System.out.println(personEntities8);

        List<PersonEntity> personEntities9=personRepo.findByFirstNameIgnoreCase("SOUVIKDGREAT");
        System.out.println(personEntities9);



    }

}
