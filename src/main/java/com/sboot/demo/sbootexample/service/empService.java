package com.sboot.demo.sbootexample.service;

import java.util.List;

import com.sboot.demo.sbootexample.entity.Employee;

public interface empService {
    List<Employee> listAllEmployees();
    void save(Employee emp);
    Employee getEmployee(int id);
    void delete(int id);
}
