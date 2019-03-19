package com.SpringBoot.SpringBootDemo.Entity;


//Question1

public class Student {
    private String name;
    private int id;
    private String competency;

    public Student(String name, int id, String competency) {
        this.name = name;
        this.id = id;
        this.competency = competency;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }
}
