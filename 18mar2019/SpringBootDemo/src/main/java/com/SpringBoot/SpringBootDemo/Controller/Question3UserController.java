package com.SpringBoot.SpringBootDemo.Controller;


import com.SpringBoot.SpringBootDemo.Entity.User;
import com.SpringBoot.SpringBootDemo.Service.Question3UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question3UserController {

    @Autowired
    Question3UserService userService;
    @RequestMapping("/user")
    public User getUser(){
        System.out.println(userService.getUser().getUserName()+" "+userService.getUser().getPassword());
           return userService.getUser();
    }
}
