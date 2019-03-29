package com.demo.restwithspring.RestWithSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


//question 3

@Entity
@Table(name = "students")
public class Student {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //question 6
    @JsonIgnore
    private Integer id;
    @Column(name = "name")
    @Size(min = 4,message = "username should be greater ")
    private String name;
    @Positive(message = "roll no should be positive")
    @Column(name = "rollNo")
    private Integer rollNo;
    @Column(name = "course")
    private String course;

    public Student() {
    }

    public Student(String name, Integer rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


}
