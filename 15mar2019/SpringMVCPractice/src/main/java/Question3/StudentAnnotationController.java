package Question3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("/student")*/
public class StudentAnnotationController {

    @RequestMapping("/")
    public ModelAndView getStudentPage(){

        System.out.println("student page hit ");
        ModelAndView modelAndView=new ModelAndView("StudentAnnotation");
        return modelAndView;
    }
}
