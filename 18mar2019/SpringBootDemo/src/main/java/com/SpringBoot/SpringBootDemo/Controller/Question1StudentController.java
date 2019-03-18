package com.SpringBoot.SpringBootDemo.Controller;


import com.SpringBoot.SpringBootDemo.Entity.Student;
import com.SpringBoot.SpringBootDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//Question no 1
@RestController
@RequestMapping("/s")
public class Question1StudentController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/student")
    public List<Student> getStudent(){
        return studentService.getStudents();
    }

    @RequestMapping("/studentInit")
    public List<Student> getStudentInit(){
        return studentService.getList();
    }
}


/*
* three ways to run the spring boot application
* method1) by running th SpringBootDemoApplication
*
* method2) by using the gradle task bootrun
*
* method3) by using the gradle task bootjar and then running the jar using command java-jar
* */