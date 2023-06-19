package com.andre.cruddemo.dao;

import com.andre.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //thats it, no need to write any code
}
