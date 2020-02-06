package com.employee.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //the objects of this class should go as rows or columns in the database tables
public class Employee {
    @Id //@id is unique identification given to an object using which database operations can be performed
    // property name will corresspond to column name
    private int id;
    private String name;
    private String salary;
    private String designation;
    public Employee() {

    }

    public Employee(int id, String name, String salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }




}
