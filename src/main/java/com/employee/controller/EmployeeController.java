package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired //needs dependency injection
    private EmployeeService employeeService;
    @GetMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeService.getEmployees();

    }
    @RequestMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id){ //used path variable as spring needs to know which argument needs to be passed to which method
       return employeeService.getEmployee(id);

   }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, value = "/employees") //map any request that is post to this method
    public void addEmployee(@RequestBody Employee employee){ //requestbody passes the employee instance to employee method
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}") //map any request that is post to this method
    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id){ //requestbody passes the employee instance to employee method
        employeeService.updateEmployee(id,employee);
    }

  @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}") //map any request that is post to this method
   public void addEmployee(@PathVariable int id){ //requestbody passes the employee instance to employee method
       employeeService.deleteEmployee(id);
    }
}
