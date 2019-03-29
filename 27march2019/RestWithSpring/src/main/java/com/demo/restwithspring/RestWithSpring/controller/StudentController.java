package com.demo.restwithspring.RestWithSpring.controller;


import com.demo.restwithspring.RestWithSpring.entity.Student;
import com.demo.restwithspring.RestWithSpring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Locale;


//Question 1

@RestController
public class StudentController {
    @Autowired
    MessageSource messageSource;

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> allStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/students")
    ResponseEntity<Student> addStudent(@Valid @RequestBody Student student){
        studentService.addStudent(student);
        URI uri= ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}").buildAndExpand(student.getId()).toUri();

        return ResponseEntity.created(uri).build();
       // return new ResponseEntity(HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    @GetMapping("/students/{id}")
    public Student getStudentWithId(@PathVariable("id") Integer id){
        return studentService.getStudentWithId(id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudentWithId(@PathVariable("id") Integer id){
        studentService.removeStudentWithId(id);
    }

    @PutMapping("/students/{id}")
    public void updateStudentWithId(@PathVariable("id") Integer id,@Valid @RequestBody Student student){
        studentService.updateStudentById(id,student);
    }


    //question 4
    @GetMapping("/greetings")
    String helloWorld(@RequestHeader(name = "Accept-Language",required = false) Locale locale){
        System.out.println(locale.getLanguage());
        return messageSource.getMessage("welcome.message",null, LocaleContextHolder.getLocale());
    }


}
