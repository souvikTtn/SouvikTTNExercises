package com.example.thymleaf.ThymleafDemo.controller;

import com.example.thymleaf.ThymleafDemo.model.Employee;
import com.example.thymleaf.ThymleafDemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/questions")
public class QuestionController {

    @RequestMapping("/q1_6")
    public ModelAndView question1(){
        ModelAndView modelAndView=new ModelAndView("q1_6");
        return modelAndView;
    }

    @RequestMapping("/q2")
    public ModelAndView question2(){
        ModelAndView modelAndView=new ModelAndView("q2");
        return modelAndView;
    }

    @GetMapping("/q3q4q5")
    public String registerEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return ("employeeForm");
    }

    @PostMapping("/q3q4q5")
    public String welcomeEmployee(@ModelAttribute("employee") Employee employee,Model model){
       if(employee.getFirstName().equals("souvik") && employee.getLastName().equals("chakraborty"))
           model.addAttribute("isAdmin",true);
        return  ("employeeWelcome");
    }

    @RequestMapping("/q7")
    public String getServerTime(Model model){
        return ("q7");
    }

    @RequestMapping("/getTime")
    @ResponseBody
    public String showTime(){
        Date date=new Date();
        return "the server time is "+date.toString();
    }

    @RequestMapping(value = "/q8")
    public String conditionalTag(){
        return "q8";
    }

    @RequestMapping("/q9")
    public String getEnumMessage(){
        return "q9";
    }

    @RequestMapping("/q9Result/{id}")
    public String getEnumMessageResult(Model model,@PathVariable("id") String id){
        model.addAttribute("person",id);
        System.out.println("HELLO " + id);
        return ("welcome");
    }

    @GetMapping("/q10")
    public String getLoader(){
        return ("userForm");
    }

    @PostMapping("/q10")
    @ResponseBody
    public String showLoader(@ModelAttribute("user") User user){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(user.getUserName());
        return "User "+user.getUserName()+" logged in sucessfully";
    }
}
