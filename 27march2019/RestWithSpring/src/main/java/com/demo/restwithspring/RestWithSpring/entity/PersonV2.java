package com.demo.restwithspring.RestWithSpring.entity;

public class PersonV2 {
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public PersonV2() {
    }

    public PersonV2(String fullName) {
        this.fullName = fullName;
    }
}
