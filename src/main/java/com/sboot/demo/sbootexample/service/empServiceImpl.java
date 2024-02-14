package com.sboot.demo.sbootexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.demo.sbootexample.entity.Employee;
import com.sboot.demo.sbootexample.repository.empRepository;

@Service
public class empServiceImpl implements empService{
    
    @Autowired
    private empRepository repo;

    public List<Employee> listAllEmployees(){
        return repo.findAll();
    }

    public void save(Employee emp){
        repo.save(emp);
    }

    public Employee getEmployee(int id){
        return repo.findById(id).get();
    }

    public void delete(int id){
        repo.deleteById(id);
    }

   

    
}
