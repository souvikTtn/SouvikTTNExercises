package com.SpringBoot.SpringBootDemo.Controller;

import com.SpringBoot.SpringBootDemo.Entity.Database;
import com.SpringBoot.SpringBootDemo.Service.Question4DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Question4DataBaseController {

    @Autowired
    Question4DatabaseService databaseService;

    @RequestMapping("/database")
    public Database getDatabase(){
        System.out.println(databaseService.getDatabase().getName());
        System.out.println(databaseService.getDatabase().getPortNo());
        return databaseService.getDatabase();
    }
}
