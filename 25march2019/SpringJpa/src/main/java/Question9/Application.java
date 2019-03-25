package Question9;

import jpaDemo.Repositories.PersonRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        PersonRepo personRepo=context.getBean("personRepo",PersonRepo.class);

        System.out.println(personRepo.customCount("souvikdgreat"));
    }
}
