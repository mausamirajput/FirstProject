package com.employee.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan("com.employee")
@EntityScan("com.employee.model")
@EnableJpaRepositories("com.employee.Repo")
public class EmployeeMain {
   public static void main(String[] args) {
       SpringApplication.run(EmployeeMain.class, args);
   }

}
