package com.SpringBoot.SpringBootDemo.Service;

import com.SpringBoot.SpringBootDemo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Question3UserService {
    @Autowired
    private User user;
    public User getUser(){
        return user;
    }
}
