package Question2;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentMultiController extends MultiActionController {
    public ModelAndView studentOneController(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("StudentMultiController one");
        ModelAndView modelAndView=new ModelAndView("StudentJsp");
        return modelAndView;
    }

    public void studentTwoController(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("StudentMultiController two");
        response.getWriter().print("hello i am student multi controller number two");
    }
}
