package com.SpringBoot.SpringBootDemo;

import com.SpringBoot.SpringBootDemo.Entity.Database;
import com.SpringBoot.SpringBootDemo.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

	//question3
	@Bean
	public User userBean(){
		User user=new User();
		user.setUserName("souvik");
		user.setPassword("ABCdef");
		return user;
	}

	@Bean
	public Database databaseBean(){
		Database database=new Database();
		return database;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
