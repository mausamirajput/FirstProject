package com.employee.service;

import com.employee.Repo.EmployeeRepository;
import com.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService  {
    @Autowired // when spring will create an instance of EmployeeService class, it is going to inject an instance of EmployeeRepository instance
    private EmployeeRepository employeeRepository;


    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>(); //creating a new list of employees and iterating over the findall
        employeeRepository.findAll()//finds all the elements in the iterable method
        .forEach (employees::add);
               return employees;
    }


    public Optional<Employee> getEmployee(int id) {
       return employeeRepository.findById(id);
   }
    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

    public void updateEmployee(int id, Employee employee)
    {
        employeeRepository.save(employee);
            }



    public void deleteEmployee(int id) {

        employeeRepository.deleteById(id);
    }

}
