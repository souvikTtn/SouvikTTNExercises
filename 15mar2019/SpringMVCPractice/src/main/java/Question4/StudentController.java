package Question4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @RequestMapping("/s2")
    @ResponseBody
    public String getStudentPage2(){

        System.out.println("student page hit ");
        return "hello world";
    }
}
