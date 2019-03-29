package com.demo.restwithspring.RestWithSpring.event;

import com.demo.restwithspring.RestWithSpring.entity.Student;
import com.demo.restwithspring.RestWithSpring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ListIterator;

@Component
public class StudentBootstrap {
    @Autowired
    StudentService studentService;

    @EventListener(ApplicationStartedEvent.class)
    public void init(){
        ListIterator<Student> studentListIterator=studentService.getAllStudents().listIterator();
       if(!studentListIterator.hasNext()){
            for (int i=1;i<=10;i++){
                Student student=new Student("Student "+i,i,"JVM");
                System.out.println("Student "+ i +" created");
                studentService.addStudent(student);
            }
        }
        System.out.println("your application is up an running");
    }

}
