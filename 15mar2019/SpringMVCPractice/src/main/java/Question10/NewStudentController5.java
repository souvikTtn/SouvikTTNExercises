package Question10;

import Question9.StudentCO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")
public class NewStudentController5 {
    @ModelAttribute
    void addingObject(Model model){
        System.out.println("model attribute");
        model.addAttribute("heading","SpringMVCDemo");
    }

    @RequestMapping("/m1")
    public ModelAndView method1(){
        System.out.println("method1 invoked");
        ModelAndView modelAndView=new ModelAndView("ModelViewDemo");
        return modelAndView;
    }

    @RequestMapping("/m2")
    public ModelAndView method2(){
        System.out.println("method1 invoked");
        ModelAndView modelAndView=new ModelAndView("ModelViewDemo");
        return modelAndView;
    }

    @RequestMapping("/m3")
    public ModelAndView method3(){
        System.out.println("method1 invoked");
        ModelAndView modelAndView=new ModelAndView("ModelViewDemo");
        return modelAndView;
    }
}
