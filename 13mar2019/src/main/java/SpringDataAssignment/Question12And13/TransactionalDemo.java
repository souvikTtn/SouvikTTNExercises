package SpringDataAssignment.Question12And13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionalDemo {
    @Autowired
    UserInsert userInsert;
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringData11.xml");
        UserInsert userInsert=applicationContext.getBean("userInsert",UserInsert.class);
        /*Question12And13*/
        System.out.println("--------Question 12-------");
        try {
//            userInsert.insertWithRequired();
//            userInsert.insertWithRequiredNew();
//            userInsert.insertWithMandatory();
//            userInsert.insertWithNever();
//            userInsert.insertWithNotSupport();
//            userInsert.insertWithSupport();


            /*Question13*/
//            userInsert.insertWithReadOnly();
//            userInsert.insertWithTimeOut();
//            userInsert.insertWithRollBack();
            userInsert.insertWithNoRollBack();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
