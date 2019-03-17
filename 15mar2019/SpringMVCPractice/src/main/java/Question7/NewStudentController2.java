package Question7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class NewStudentController2 {

    @RequestMapping("/s5/{firstName}/{lastName}")
    public ModelAndView getStudentName(@PathVariable Map<String,String> studentNameMap){
       ModelAndView modelAndView=new ModelAndView("Student2");
       String firstName=studentNameMap.get("firstName");
       String lastName=studentNameMap.get("lastName");
       modelAndView.addObject("firstName",firstName);
       modelAndView.addObject("lastName",lastName);
       return modelAndView;
    }
}
