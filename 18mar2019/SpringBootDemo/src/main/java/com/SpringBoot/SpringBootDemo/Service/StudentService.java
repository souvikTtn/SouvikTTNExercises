package com.SpringBoot.SpringBootDemo.Service;

import com.SpringBoot.SpringBootDemo.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

     List<Student> students;
    public List<Student> getStudents(){
        List<Student> students= Arrays.asList(new Student("souvik",1,"jvm"),
                new Student("subham",1,"jvm"),
                new Student("divya",2,"amc"),
                new Student("dhruv",3,"amc"),
                new Student("deepika",4,"jvm"));
        return students;
    }

    public List<Student> getList(){
        if(students==null)
         return students=new ArrayList<>();
        return students;
    }

}
