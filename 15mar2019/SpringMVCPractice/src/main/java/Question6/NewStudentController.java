package Question6;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewStudentController {

    @RequestMapping("/s4/{firstName}/{lastName}")
    public ModelAndView getStudentName(@PathVariable("firstName")String firstName, @PathVariable("lastName")String lastName){
       ModelAndView modelAndView=new ModelAndView("Student2");
       modelAndView.addObject("firstName",firstName);
       modelAndView.addObject("lastName",lastName);
       return modelAndView;
    }
}
