package com.demo.restwithspring.RestWithSpring.repository;

import com.demo.restwithspring.RestWithSpring.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {
    List<Student> findAll();
}
