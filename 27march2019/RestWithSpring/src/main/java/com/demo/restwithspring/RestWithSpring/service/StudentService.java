package com.demo.restwithspring.RestWithSpring.service;

import com.demo.restwithspring.RestWithSpring.entity.Student;
import com.demo.restwithspring.RestWithSpring.exception.StudentNotFoundException;
import com.demo.restwithspring.RestWithSpring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    //create
    public void addStudent(Student student){
        studentRepository.save(student);
    }

    //read
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    //read
    public Student getStudentWithId(Integer id){
        Optional<Student> optionalStudent= studentRepository.findById(id);
        if (optionalStudent.isPresent()){
            return optionalStudent.get();
        }
        else throw new StudentNotFoundException("no student exists");
    }

    //delete
    public void removeStudentWithId(Integer id){
        studentRepository.deleteById(id);
    }

    //update
    public void updateStudentById(Integer id,Student student){
        Optional<Student> optionalStudent=studentRepository.findById(id);
            if (optionalStudent.isPresent()){
                studentRepository.save(student);
            }
            else throw new StudentNotFoundException("Student with id doesn't exists");
    }

}
