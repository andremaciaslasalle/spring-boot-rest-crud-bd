package com.andre.cruddemo.dao;

import com.andre.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO{
    List<Employee> findAll();
}
