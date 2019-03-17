package Question5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController2 {

    @RequestMapping("/s3")
    public ModelAndView StudentPage(){
        String greeter="hello world";
        ModelAndView modelAndView=new ModelAndView("Student2");
        modelAndView.addObject("msg",greeter);
        return modelAndView;
    }
}
