package SpringAopAndEventsAssignments.Question9;

import org.springframework.stereotype.Service;

@Service
public class MyNewService {

    public void method1(Integer integer,String string) {
        System.out.println("m1 method of service is invoked");
    }

}
