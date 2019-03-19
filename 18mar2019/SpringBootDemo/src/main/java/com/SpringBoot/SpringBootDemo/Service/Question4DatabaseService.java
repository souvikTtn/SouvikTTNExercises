package com.SpringBoot.SpringBootDemo.Service;

import com.SpringBoot.SpringBootDemo.Entity.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Question4DatabaseService {
    @Autowired
    Database database;

    @Value("${database.name}")
    String name;
    @Value("${database.port}")
    int portNo;

    public Database getDatabase(){
        database.setName(name);
        database.setPortNo(portNo);
        return database;
    }
}
