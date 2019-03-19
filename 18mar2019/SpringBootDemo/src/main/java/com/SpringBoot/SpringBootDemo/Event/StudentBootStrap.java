package com.SpringBoot.SpringBootDemo.Event;

import com.SpringBoot.SpringBootDemo.Controller.Question1StudentController;
import com.SpringBoot.SpringBootDemo.Entity.Student;
import com.SpringBoot.SpringBootDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.ListIterator;

@Component
public class StudentBootStrap {
    @Autowired
    StudentService studentService;
    @EventListener(Student.class)
    public void init() {
        ListIterator<Student> studentIterator = studentService.getList().listIterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student=new Student("student "+i,i,"jvm");
                System.out.println("Student " + i + " created");
                System.out.println(studentService.getList().add(student));
            }
        }
        System.out.println("Your Application is up and running");
       // System.out.println(studentService.getList());
    }

}

