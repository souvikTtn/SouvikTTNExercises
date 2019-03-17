package Question9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewStudentController4 {

    @RequestMapping("/s7/{firstName}/{lastName}")
    public ModelAndView getStudentName(StudentCO studentCO){
       ModelAndView modelAndView=new ModelAndView("Student2");
       String firstName=studentCO.getFirstName();
       String lastName=studentCO.getLastName();
       modelAndView.addObject("firstName",firstName);
       modelAndView.addObject("lastName",lastName);
       return modelAndView;
    }
}
