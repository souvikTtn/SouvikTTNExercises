package Question7;

import jpaDemo.Repositories.PersonRepo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");

        PersonRepo personRepo=context.getBean("personRepo",PersonRepo.class);

        List<Object[]> personlist=personRepo.customFindMultipleByAge(24);
        for (Object[] objects:personlist){
            for (Object object:objects){
                System.out.println(object);
            }
        }
    }
}
