package com.employee.Repo;

import com.employee.model.Employee;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface EmployeeRepository extends CrudRepository<Employee , Integer> { //takes two arguments, first is the entity class and other is the data type of that class

}
