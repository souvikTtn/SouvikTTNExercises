package com.example.thymleaf.ThymleafDemo.model;

public enum Person {
    USER("User"),ADMIN("Admin"),SUPER_ADMIN("Super Admin");
    String value;
    Person(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
