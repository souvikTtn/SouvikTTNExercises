package Question8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class NewStudentController3 {

    @RequestMapping("/s6")
    public ModelAndView getStudentName(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName){
       ModelAndView modelAndView=new ModelAndView("Student2");
       modelAndView.addObject("firstName",firstName);
       modelAndView.addObject("lastName",lastName);
       return modelAndView;
    }
}
